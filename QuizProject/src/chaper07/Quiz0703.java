package chaper07;
import java.util.Scanner;

public class Quiz0703
{
		//세 개의 정수를 인자로 전달 받아서 그중 가장 작은 수를 반환하는 함수를 정의하라 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println(small(x, y, z));
		sc.close();
	}
	
	public static int small(int num1, int num2, int num3) {
		
		if(num1 - num2 <0)
		{
			if(num1 - num3<0);
			{
				return num1;
			}
		}
		else if(num2 - num3<0)
		{
			return num2;
		}
		else if (num2 - num3<0);
		{
				return num3;
		}
	}

}
