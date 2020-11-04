interface Calculate3{
	void cal(int a, int b);
}


public class E2_TwoParamCNoReturn {

	public static void main(String[] args) {
		Calculate3 c;
		c=(a,b) -> System.out.println(a+b);
		c.cal(4,3);
		
		c=(a,b) -> System.out.println(a-b);
		c.cal(4,3);
		
		c=(a,b) -> System.out.println(a*b);
		c.cal(4,3);
	}
}
