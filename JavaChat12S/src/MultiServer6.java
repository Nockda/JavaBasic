import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiServer6 {
	
	ServerSocket serverSocket = null;
	Socket socket = null;
	Map<String,PrintWriter> clientMap;
	
	// 생성자
	public MultiServer6() {
		// 클라이언트의 출력스트림을 저장할 해쉬맵 생성.
		clientMap = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정.
		Collections.synchronizedMap(clientMap);
	}
		
	public void init() {
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 시작됐습니다.");
			
			while(true) {
				socket = serverSocket.accept();
				//연결된 원격 어드레스의 정보를 보여준다.
				System.out.println(socket.getInetAddress() + ":" + socket.getPort());
			
				Thread msr = new MultiServerT(socket); // 쓰레드 생성	
				msr.start();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void list(PrintWriter out) {
		//출력스트림을 순차적으로 얻어와서 해당 메시지 출력
		Iterator<String> it = clientMap.keySet().iterator();
		String msg = "사용자 리스트 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0,msg.length()-1) + "]";
		
		try {
			out.println(msg);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		//서버 객체 생성
		MultiServer6 ms = new MultiServer6();
		ms.init();
	}
		
	///////////////////////////////// 내부클래스
	// 클라이언트로 부터 읽어온 메시지를 다른 클라이언트(socket)에 보내는 역할을 하는 메서드
	class MultiServerT extends Thread{
		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;
		String name= "";
		
		//생성자
		public MultiServerT(Socket socket) {
			this.socket = socket;
			try {
				out = new PrintWriter(this.socket.getOutputStream(),true);
				in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			} catch(Exception e) {
				System.out.println("예외:"  + e);
			}
		}
		
		// 쓰레드를 사용하기 위해 run() 메서드 재정의
		@Override
		public void run()
		{
			String s ="";
			
			try {
				name = in.readLine();
				System.out.println("[" + name + "] 님이 입장하셨습니다.");
				
				// 현재 객체가 갖고 있는 소켓 죄하고, 다른 소켓에게 접속 알림 
				sendAllMsg("[" + name + "] 대화방 입좡~", "");
				
				// 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap.put(name, out);
				
				System.out.println("현재 접속자 수는 " + clientMap.size() + "명 입니다.");
				
				// 입력 스트림이 null 이 아니면 반복
				while(in!=null) {
					s = in.readLine();
						
					if(s.equals("q") || s.equals("Q"))
						break;
					
					System.out.println(name + ">" + s);
					
					if(s.equals("/list"))
						list(out);
					else
						sendAllMsg(s, name);
				}
				System.out.println("쓰레드 종료");
			
			} catch(Exception e) {
				System.out.println("예외:" + e);
			} finally {
					// 예외가 발생할때 퇴장. 해쉬맵에서 해당데이터 제거
					// 보통 종료하거나 나가면 java.net.SocketException : 예외 발생
					clientMap.remove(name);
					sendAllMsg(name + "님 퇴좡~", "");
					System.out.println("현재 접속자수는 : " + clientMap.size());
					
					try {
					in.close();
					out.close();
						
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		// 접속된 모든 클라이언트한테 메시지 전달
		public void sendAllMsg(String msg, String name) {
			//출력 스크림을 순차적으로 얻어와서 해당 메시지 출력
			Iterator it = clientMap.keySet().iterator();
			
			while(it.hasNext()) {
				try {
					PrintWriter it_out = (PrintWriter) clientMap.get(it.next());
					if(name.equals("")) {
						it_out.println(msg);
					} else {
						it_out.println(name + ">" + msg);
					}
				}catch(Exception e) {
					System.out.println("예외 : " + e);
				}
			}
		}
	}
}