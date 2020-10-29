package chaper07;
import java.util.Scanner;

public class Quiz0702
{
		//세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의하라
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		System.out.println("입력하신 수 중에 가장 큰 수는 " + Big(x, y, z));
		sc.close();
	}
	
	public static int Big(int num1, int num2, int num3) {
		
		int max = num1;
		if(max < num2)
		{
			max = num2;
		}
		if(max < num3)
		{
			max = num3;
		}
		return max;
	}
}
