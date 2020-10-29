package chapter02;
//import java.util.Scanner;
//
//public class Quiz0205
//{
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int mul = num1 * num2;
//		double absolute = Math.sqrt(mul * mul);
//		System.out.printf("%d * %d = |%d| \n", num1, num2, (int)absolute);
//		
//		sc.close();
//	}
//
//}


		// 삼항 연산자

//import java.util.Scanner;
//
//public class Quiz0205
//{
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int mul = num1 * num2;
//		
//		int absolute;
//		absolute = (mul > 0) ? mul : -mul;
//		System.out.println(absolute);
//		
//		sc.close();
//	}
//
//	
//}


		// if 함수


import java.util.Scanner;

public class Quiz0205
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int mul = num1 * num2;
		
		if(mul > 0)
		{
		System.out.println(mul);
		}
		else
		{
			System.out.println(-mul);
		}
		
		sc.close();
	}
	
	
}

