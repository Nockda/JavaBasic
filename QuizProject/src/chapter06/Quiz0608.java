package chapter06;

public class Quiz0608
{

	public static void main(String[] args)
	{
		//문제 06-08
		//구구단을 출력하되 짝수단만 출력하도록 프로그램을 작성하라.
		//단, 2단은 2*2까지만, 4단은 4*4까지만....8단은 8*8까지만 출력해야 한다.

		for(int i = 2; i < 10; i = i + 2 )
		{
			System.out.println(i + "단");
			System.out.println();
			for(int j = 1; j <= i; j++)
			{
//				System.out.println(i + " X " + j + " = " + (i * j));
				System.out.printf("%d X %d = %d", i, j, i*j);
				System.out.print('\n');
			}
			System.out.println("-----------------");
		}

	}

}
