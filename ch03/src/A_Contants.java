
public class A_Contants
{

	public static void main(String[] args)
	{
		int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		// final을 쓰는 경우는 한번 선언 시에 변경 불가능
		
		CONST_ASSIGNED = 12;
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		
		MAX_SIZE = 30;
		System.out.println("상수1 : " + MAX_SIZE);
		
		// final이 아닌 경우에는 변경 가능
		
	}

}
