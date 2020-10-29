
public class D_operatePromotion
{

	public static void main(String[] args)
	{
		short num1 = 11;
		short num2 = 22;
		
		//다음 문장으로는 에러남
		//short result = num1 + num2;
		//System.out.println(result);
		
		// 아래는 에러 안남
		short result = (short)(num1 + num2);
		System.out.println(result);
		
	}

}
