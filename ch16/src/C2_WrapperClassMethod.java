
public class C2_WrapperClassMethod {

	public static void main(String[] args) {
		Integer n1= Integer.valueOf(5);
		Integer n2 = Integer.valueOf("1024");
		
		System.out.println("큰 수는 " + Integer.max(n1,n2));
		System.out.println("작은 수는 " + Integer.min(n1,n2));
		System.out.println("합은 " + Integer.sum(n1,  n2));
		System.out.println();
		
		System.out.println("12의 2진수 표현 : " + Integer.toBinaryString(12));
		System.out.println("12의 8진수 표현 : " + Integer.toOctalString(12));
		System.out.println("12의 16진수 표현 : " + Integer.toHexString(12));

	}

}
