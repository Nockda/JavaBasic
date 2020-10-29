package chapter06;
import java.util.Scanner;

public class Quiz0612
{

	public static void main(String[] args)
	{
		// 사용자로부터 2개의 정수를 입력받는다. 가령 2와 6을 입력받았다면
		// 2+3+4+5+6을 구하는 프로그램 을 작성하라.
		// 단 6과 2를 입력받는다면 6+5+4+3+2를 구
		// 해야 한다.
		
		Scanner sc = new Scanner(System.in);		
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		int result = 0;
		
		
		//계산식
		if(i-j<0)   //i=3, j-5
		{
			do{
					System.out.print(i + "+");
					result = result + i;
					i++;
			} while(i-j<=0);
		}
		else
		{
			do {
				System.out.print(i + "+");
				result = result + i;
				i--;
			} while(j-i<=0);
		}
		System.out.print('\b' + "=");
		System.out.println(result);
		sc.close();
	}
	
}
