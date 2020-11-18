import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer2 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String s = "";
			
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("서버가 시작됐습니다.");
				
			socket = serverSocket.accept();
			//연결된 원격 어드레스의 정보를 보여준다.
			System.out.println(socket.getInetAddress() + ":" + socket.getPort());
				
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				
			String name = in.readLine();
			System.out.println("[" + name + "] 님이 입장하셨습니다.");
			out.println("[" + name + "] 대화방 입좡~");
			
			while(in!=null) {
				s = in.readLine();
					
				if(s == null) 
					break;
				if(s.equals("q") || s.equals("Q"))
					break;
				
				System.out.println(s);
				out.println(name + ">>" + s);
			}
				
			System.out.println("서버가 종료되었습니다.");
				
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
					
				socket.close();
				serverSocket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
