package chapter06;

public class Quiz0607
{
	
	public static void main(String[] args)
	{
		int num = 0;
		
		while (num++<100)
		{
			if(((num % 7) == 0) || (num % 9) == 0)
			{
				System.out.println(num);
			}
		}
	}
	
}
