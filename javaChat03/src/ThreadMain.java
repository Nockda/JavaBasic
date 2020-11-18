import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		String s_num = s.nextLine();
		int n_num = Integer.parseInt(s_num);
		
		try {
			Thread tsub = new ThreadSub(n_num);
			tsub.start();
		} catch(Exception e) {
			System.out.println("예외 : " + e);
			
		}
		System.out.println("tell me your name ");
		String s_name = s.nextLine();
	}
}


class ThreadSub extends Thread{
	int nNum;
	
	public ThreadSub(int num) {
		this.nNum = num;
	}
	
	// run()메소드 재정의
	@Override
	public void run() {
		int i = 0;
		while (i < nNum) {
			try{
				Thread.sleep(1000);
				i ++;
				System.out.println("Thread : " + i);
			}
			
			catch (Exception e ) {
				System.out.println("예외 : " + e);
			}	
		}
	}
}

