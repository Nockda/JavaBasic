package chapter06;
import java.util.Scanner;

public class Quiz0605
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		while(true) {
			int num1 = sc.nextInt();
			result = result + num1;
			if(num1 == 0)
			{
				System.out.println("모두 더한 값은 " + result);
				break;
			}
		}
	sc.close();
	}
}
