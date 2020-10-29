package chapter02;
import java.util.Scanner;

public class Quiz0202
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int mul = num1 * num1;
		System.out.printf("%d * %d = %d \n", num1, num1, mul);
		
		sc.close();
	}

}
