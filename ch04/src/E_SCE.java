
public class E_SCE
{

	public static void main(String[] args)
	{
		// SCE : Short-Circuit Evaluation
		//     : 최단거리 연산 : 효율성을 위해 뒤쪽 계산은 하지 않는다.
		// 참 && 참 : 앞쪽이 거짓이면 뒷쪽 계산이 필요가 없기 때문에 안한다.
		// 참 || 거짓 : 앞쪽이 참이기 때문에 or연산자에서 뒷쪽은 계산 안한다.
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		
		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);	
		
	}

}
