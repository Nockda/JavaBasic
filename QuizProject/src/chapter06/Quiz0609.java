package chapter06;
import java.util.Scanner;

public class Quiz0609
{
	
	public static void main(String[] args)
	{
		// 문제 06-09
		//사용자로부터 정수 하나를 입력받은 후
		//그 수에 해당하는 구구단을 역순으로 출력하시오.		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
			System.out.println(num + "단");
			System.out.println();
			for(int j = 9; j > 0; j--)
			{
				//System.out.println(i + " X " + j + " = " + (i * j));
				System.out.printf("%d X %d = %d", num, j, num * j);
				System.out.print('\n');
			}
		
		
		sc.close();
		
	}
}
