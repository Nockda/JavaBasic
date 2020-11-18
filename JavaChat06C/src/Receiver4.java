import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receiver4 extends Thread {

	Socket socket;
	BufferedReader in = null;
	
	//Socket을 매개변수로 받는 생성자.
	public Receiver4(Socket socket) {
		this.socket = socket;
		
		try {
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			
		} catch (Exception e) {
			System.out.println("예외1: " +e);
		}
	}
	//run()메소드 재정의
			@Override	
			public void run() {
				while(in!=null) {
					try {
// 입력은 main 쓰레드가 받기 때문에 다음코드는 작동하지 않으미
//						System.out.println("Thread Receive : " + in.readLine());
//					} catch(Exception e) {
//						e.printStackTrace();
//						break;
//					}
					System.out.println("Thread Receive : " + in.readLine());
					} catch (java.net.SocketException ne) {
						// 여기서 while문을 멈춰줘야댐
						System.out.println("접속을 종료합니다.");
						break;
					} catch (Exception e) {
						System.out.println("예외 : " + e);
					}
				}
				try {
					in.close();
				}catch(Exception e ) {
					e.printStackTrace();
		}
	}	
}
