package chapter02;
import java.util.Scanner;

public class Quiz0201
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		int division = num1 / num2;
		System.out.printf("%d + %d = %d \n", num1, num2, plus);
		System.out.printf("%d - %d = %d \n", num1, num2, minus);
		System.out.printf("%d * %d = %d \n", num1, num2, multiple);
		System.out.printf("%d * %d = %d \n", num1, num2, division);
		
		sc.close();
	}

}
