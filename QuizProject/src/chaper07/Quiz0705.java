package chaper07;
import java.util.Scanner;

public class Quiz0705
{

	public static void main(String[] args)
	{
		//세 개의 정수를 입력 받아서 앞의 두 수는 연산에 이용하고 세 번째 수는 연산자로 사용한다.
		//세번째 인수가 1이면 +, 2이면 -, 3이면 *, 4이면 / 연산을 한다. 그 외의 수가 들어오면 다시 전체 입력을 받는다.
		//각 각의 연산은 메서드로 만들어 호출한다.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (z>4)
				{	
				System.out.println("4 이하의 숫자를 입력해주세요.");
				continue;
				}
			System.out.println( calculate(x, y, z));
		break;
		}
		sc.close();
		
	}
	
	public static int calculate(int num1, int num2, int num3) {
		if (num3 == 1) {
			int result = num1 + num2;
			return result;
		}
		else if(num3 == 2) {
			int result = num1 - num2;
			return result;
		}
		else if(num3 == 3) {
			int result =  num1 * num2;
			return result;
		}
		else
		{
			int result = num1 / num2;
			return result;
		}
	}
	
}
