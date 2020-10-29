
public class B_IntegerLiterals
{

	public static void main(String[] args)
	{
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
		
		//아래는 진수 변환하여 출력하는 것
		
		System.out.println("==========================================");
		
		int i = 123;
		
		String binaryString = Integer.toBinaryString(i);
		String octalstring = Integer.toOctalString(i);
		String hexstring = Integer.toHexString(i);
		
		System.out.println(binaryString);
		System.out.println(octalstring);
		System.out.println(hexstring);
		
		
	}

}
