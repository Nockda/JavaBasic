package chapter06;
import java.util.Scanner;

public class Quiz0603
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int result = 1;
		while(num1 > 0)
		{
			if(num1>1) {
				System.out.print(num1 + "*");
			}
			else {
				System.out.print(num1 + "=");
			}
			result = result * num1;
			num1--;
			
		}
		System.out.println(result);
		sc.close();
	}
}
