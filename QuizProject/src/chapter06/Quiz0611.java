package chapter06;

public class Quiz0611
{

	public static void main(String[] args)
	{
		// 1부터 100까지 정수중에서 짝수의 합을 구하라. 단 do~while문을 이용하라
		
		int i = 0;
		int result = 0;
		
		do
		{
			i = i + 2;
			result = result + i;
		} while (i<100);
		System.out.println(result);
	}

}
