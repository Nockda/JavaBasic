package chapter06;
import java.util.Scanner;

public class Quiz0610
{

	public static void main(String[] args)
	{
		//사용자로부터 5개의 정수를 입력받아서 합을 구하여 출력한다.
		//만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구해야 한다.
		//그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.
		
		Scanner sc = new Scanner(System.in);
		
		int nResult=0;
		int nCount = 0;
		
		while (nCount<5)
		{
			System.out.println("숫자입력해주세여");
			int nTemp = sc.nextInt();
			if(nTemp<1) {
				System.out.println("숫자 다시 입력하세요");
				continue;
			}
			nResult = nResult +nTemp;
			nCount++;
		}
		sc.close();
		System.out.println(nResult);
	}
}