package chapter06;
import java.util.Scanner;

public class Quiz0602
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int num1 = sc.nextInt();
		System.out.println("영어점수 : ");
		int num2 = sc.nextInt();
		System.out.println("수학점수 : ");
		int num3 = sc.nextInt();
		int result = (num1 + num2 + num3)/3;
		System.out.println("당신의 평균은 " + result);
		
		if(result > 90) {
			System.out.println("학점 : A");
		}
		else if (result > 80) {
			System.out.println("학점 : B");
		}	
		else if (result > 70) {
			System.out.println("학점 : C");
		}
		else if (result > 50) {
			System.out.println("학점 : D");
		}
		else {
			System.out.println("학점 : F");
		}
		sc.close();
	}
}
