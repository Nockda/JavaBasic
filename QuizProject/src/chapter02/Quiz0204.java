package chapter02;
//import java.util.Scanner;
//
//public class Quiz0204
//{
//
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2)
//		{
//			System.out.println(num1);	
//		}
//		else
//		{
//			System.out.println(num2);
//		}
//		
//		sc.close();
//	}
//
//}


// 삼항 연산자 - big = (....) ? A : B;
// (....)조건이 맞으면 A, 틀리면 B

import java.util.Scanner;

public class Quiz0204
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big;
		
		big = (num1 > num2) ? num1 : num2;
		System.out.println("큰 수 : " + big);
		
		
		sc.close();
	}

}
