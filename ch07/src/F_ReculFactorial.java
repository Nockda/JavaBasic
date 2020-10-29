
public class F_ReculFactorial
{

	public static void main(String[] args)
	{
		System.out.println("3 Factorial : " + factorial(3));
		System.out.println("12 Factorial : " + factorial(12));
		
	}
	
	public static int factorial(int n) {
		if (n==1)
			return 1;
		else
			return n * factorial(n-1);
		
	}
	
}
