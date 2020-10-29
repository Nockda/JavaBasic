import java.util.InputMismatchException;
import java.util.Scanner;

public class A5_ExceptionCase5 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
		System.out.println("a/b ... a?");
		int n1 = kb.nextInt();
		
		System.out.println("a/b ... b?");
		int n2 = kb.nextInt();
		
		System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
		
		kb.close();
		} catch(InputMismatchException | ArithmeticException e) {
			String str = e.getMessage();
			if(str == null) {
				System.out.println("숫자를 넣어주세요");
			}
			//e.printStackTrace();
			else if(str.equals("/ by zero")) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		System.out.println("good bye~");
	}
}
