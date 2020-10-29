package chaper07;
import java.util.Scanner;

public class Quiz0701
{
		//세 개의 정수를 인자로 전달 받아서 평균을 반환하는 함수를 정의하라
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("평균은 " + aver(x, y, z));
		sc.close();
	}
	
	public static double aver(int num1, int num2, int num3) {
		double result = (double)(num1 + num2 + num3)/3;
		return result;
	}

}
