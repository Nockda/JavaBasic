package Chapter13;
import java.util.Scanner;

public class Quiz1301Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[5];		// 이 상태에서 myNum은 값은 없지만 메서드는 할 수 있음.
		
		for (int i = 0; i<myNum.length; i++) {
			myNum[i] = sc.nextInt();
		}
		
		
		// 최대값 구하기 : 메서드(함수) 호출
		getMax(myNum);
		// 최소값 구하기 : 메서드(함수) 호출
		getMin(myNum);
		// 합 구하기 : 메서드(함수) 호출
		getTotal(myNum);
	}	
		
		
		public static void getMax(int[] num) {
			int nMax = num[0];
			for (int i = 0; i<num.length; i++) {
				if (nMax < num[i]) {
					nMax = num[i];
				}
			}
			System.out.println("최대값: " + nMax);
		}
		
		public static void getMin(int[] num) {
			int nMin = num[0];
			for (int i = 0; i<num.length; i++) {
				if (nMin > num[i]) {
					nMin = num[i];
				}
			}
			System.out.println("최소값: " + nMin);
		}
		
		
		public static void getTotal(int[] num)
		{
			int nSum = 0;
			for (int i = 0; i<num.length; i++) {
					nSum = nSum + num[i];
				}
			System.out.println("합: " + nSum);
			}
		
	
}
