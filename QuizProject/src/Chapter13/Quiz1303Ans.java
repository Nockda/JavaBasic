package Chapter13;
import java.util.Scanner;

public class Quiz1303Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[10];
		
		System.out.println("숫자 10개를 입력하세요");
		for(int i = 0; i < 10; i++) {
			myNum[i] = sc.nextInt()	;
		}
		
		System.out.print("짝수 ");
		for (int i=0; i<10; i++) {
			if(myNum[i] %2 ==0) {
				System.out.print(myNum[i] + " ");
			}
		}
		
		System.out.println();
		System.out.print("홀수 ");
		for (int i=0; i<10; i++) {
			if(myNum[i] %2 ==1) {
				System.out.print(myNum[i] + " ");
			}
		}
	}
}
