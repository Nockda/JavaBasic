package Chapter13;
import java.util.Scanner;

public class Quiz1304Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[10];
		
		int nOddCnt = 0;
		int nEvenCnt = 9;
		
		System.out.println("숫자 10개를 입력하세요");
		
		for(int i = 0; i < 10; i++) {
			int nTemp = sc.nextInt();
			if(nTemp % 2 ==1) {
				// 홀수
				myNum[nOddCnt] = nTemp;
				nOddCnt++;
			} else {
				// 짝수
				myNum[nEvenCnt] = nTemp;
				nEvenCnt--;
			}
		}
		
		// 출력
		for(int i = 0; i < 10; i++) {
			System.out.print(myNum[i] + " ");
		}
		
	}
}
