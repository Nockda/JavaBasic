package Game;

import java.util.Random;
import java.util.Scanner;

public class RCPgame
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random com1 = new Random();
		
		while (true) {
			System.out.println("가위(1) 바위(2) 보(3) 중에 하나를 내세요. 게임종료(0)");
			
			int x = sc.nextInt();
			int y = com1.nextInt(4);
			
			if(x==0)
			{
				System.out.println("게임종료");
				break;
			}
			else if(x==1)
			{
				if(y==1)
				{
					System.out.println("YOU = 가위 / COM = 가위" + '\n' + "비겼습니다.");
				}
				else if(y==2)
				{
					System.out.println("YOU = 가위 / COM = 바위" + '\n' + "당신이 졌습니다.");
				}
				else
				{
					System.out.println("YOU = 가위 / COM = 보" + '\n' + "당신이 이겼습니다.");
				}
			}
			else if(x==2)
			{
				if(y==1)
				{
					System.out.println("YOU = 바위 / COM = 가위" + '\n' + "당신이 이겼습니다.");
				}
				else if(y==2)
				{
					System.out.println("YOU = 바위 / COM = 바위" + '\n' + "비겼습니다.");
				}
				else if(y==3)
				{
					System.out.println("YOU = 바위 / COM = 보" + '\n' + "당신이 졌습니다.");
				}
			}
			else if(x==3)
			{
				if(y==1)
				{
					System.out.println("YOU = 보 / COM = 가위" + '\n' + "당신이 졌습니다.");
				}
				else if(y==2)
				{
					System.out.println("YOU = 보 / COM = 바위" + '\n' + "당신이 이겼습니다.");
				}
				else if(y==3)
				{
					System.out.println("YOU = 보 / COM = 보" + '\n' + "비겼습니다.");
				}
			}
			else
			{
				System.out.println("0~4까지의 숫자만 입력하세요.");
			}	
			System.out.println();
		}
	sc.close();
	}
}
