package Chapter13;
// 문제 1
// 길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
// 그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.


import java.util.Scanner;

public class Quiz1301 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		// 5개 숫자 입력
		for(int i = 0; i < 5; i++)
		{
			num[i] =  sc.nextInt();
		}
		int nMax = getMax(num);
		int nMin = getMin(num);
		int nSum = sum(num);
		System.out.println("최대값은 " + nMax);
		System.out.println("최소값은 " + nMin);
		System.out.println("합계는 " + nSum);
		sc.close();
	}
	
	// 최대값
	public static int getMax(int[] num)
	{
		int nMax = 0;
		for(int i = 0; i < num.length; i++) {
			if (nMax < num[i])
			{
				nMax = num[i];
			}
		}
		return nMax;
	}
	
	//최소값
	public static int getMin(int[] num)
	{
		int nMin = 200000000;
		for(int i = 0; i < num.length; i++) {
			if (nMin > num[i])
			{
				nMin = num[i];
			}
		}
		return nMin;
	}
	
	// 합계
	public static int sum(int[] num)
	{
		int nSum = 0;
		for (int i = 0; i < num.length; i++) {
			nSum = nSum + num[i];
		}
		return nSum;
	}
	
}