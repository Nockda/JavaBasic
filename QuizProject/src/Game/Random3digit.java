package Game;

import java.util.Random;

public class Random3digit
{

	public static void main(String[] args)
	{
		Random random1 = new Random();
		
		while(true)
		{
			int num1 = random1.nextInt(9) + 1;
			int num2 = random1.nextInt(10);
			
			if(num2 == num1) continue;
			else
			{
				int num3 = random1.nextInt(10);
				if(num3 == num1 && num3 == num2) continue;
				else
				{
					System.out.print(num1);
					System.out.print(num2);
					System.out.print(num3);
					break;
				}
			}
		}
	}
}