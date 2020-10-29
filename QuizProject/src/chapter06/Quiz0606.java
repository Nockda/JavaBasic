package chapter06;
import java.util.Scanner;

public class Quiz0606
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		double result = 0;
		
		while(num>0) {
			double num1 = sc.nextDouble();
			result = (result + num1);
			num--;
		}
		System.out.println(result/num2);
		
		sc.close();
	}
}
