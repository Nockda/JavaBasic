
public class E_LocalVariable
{

	public static void main(String[] args)
	{
		boolean ste = true;
		int num1 = 11;
		
		if(ste)
		{
			//int num1 =22;					같은 영역내에서 동일 이름 변수 중복 선언 불가
			num1++;
			System.out.println(num1);
		}
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		//System.out.println(num2);			같은 영역내에서 동일 이름 변수 중복 선언 불가
	}

}
