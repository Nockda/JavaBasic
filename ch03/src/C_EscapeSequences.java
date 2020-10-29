
public class C_EscapeSequences
{

	public static void main(String[] args)
	{
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB\tC");
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C');
		System.out.println("A\\BC");
		System.out.println("A\'BC");
		System.out.println("A\"BC");

	}

}
