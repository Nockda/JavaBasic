package chapter02;
import java.util.Scanner;

public class Quiz0203
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int devide = num1 / num2;
		int remain = num1 % num2;
		//System.out.printf("%d / %d = %d \n", num1, num2, devide);
		System.out.println(num1 + " 나누기 " + num2 + "의 몫은 " + devide + " 입니다.");
		System.out.println(num1 + " 나누기 " + num2 + "의 나머지는 " + remain + " 입니다.");
		
		sc.close();
	}
	
}
