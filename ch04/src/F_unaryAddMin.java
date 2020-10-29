
public class F_unaryAddMin
{

	public static void main(String[] args)
	{
		short num1 = 5;
		System.out.println(+num1);			//결과적으로 불필요한 + 연산(cpu 2번돔)
		System.out.println(-num1);			//부호를 바꿔서 얻은 결과 출력
		
		short num2 = 7;
		short num3 = (short)(+num2);		//형 변환 하지 않으면 오류남
		short num4 = (short)(-num2);		//형 변환 하지 않으면 오류남
		System.out.println(num3);
		System.out.println(num4);
		
	}

}
