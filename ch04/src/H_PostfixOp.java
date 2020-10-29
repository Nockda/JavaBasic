
public class H_PostfixOp
{

	public static void main(String[] args)
	{
		int num = 5;
		
		System.out.print((num++) + " ");		// 출력 후에 값 증가
		System.out.print((num++) + " ");		// 상동, 당장 값에 반영
		System.out.print(num + "\n");
		
		System.out.print((num--) + " ");		// 출력 후에 값 감소
		System.out.print((num--) + " ");		// 상동, 당장 값에 반영
		System.out.println(num);
		
		System.out.print(num + '\n');			// '\n'은 기본 자료형이라서 값을 더해버림.
		
		
		
	}

}
