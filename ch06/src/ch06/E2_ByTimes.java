package ch06;

public class E2_ByTimes
{

	public static void main(String[] args)
	{
		for(int i = 2; i < 10; i++ )
		{
			System.out.println(i + "단");
			System.out.println();
			for(int j = 1; j < 10; j++)
			{
//				System.out.println(i + " X " + j + " = " + (i * j));
				System.out.printf("%d X %d = %d", i, j, i*j);
				System.out.print('\n');
			}
			System.out.println("-----------------");
		}
	}

}
