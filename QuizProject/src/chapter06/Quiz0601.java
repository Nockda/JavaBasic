package chapter06;
import java.util.Scanner;

public class Quiz0601
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = num1 - num2;
		
		if(result > 0) {
			System.out.println(result);
		}
		else
			System.out.println(-result);
		
		sc.close();
	}

}

