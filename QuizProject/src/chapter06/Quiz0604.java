package chapter06;

public class Quiz0604
{

	public static void main(String[] args)
	{
		long num1 = 1000;
		long result = 0;
		
		do {
			if(num1>1)
				System.out.print(num1 + "+");
			else
				System.out.print(num1 + "=");
			result = result + num1;
			num1--;
		} while(num1 > 0);
		System.out.println(result);
		
	}

}
