
public class B3_IndexOf {
	public static void main(String[] args) {
		String st1 = "AppleBananaOrange";
		int num1 = st1.indexOf("B");
		int num2 = st1.indexOf("O");
		
		String st2 = st1.substring(num1, num2);
		System.out.println(st2);
		
		int num3 = st1.indexOf("A");
		int num4 = st1.indexOf("a");
		String st3 = st1.substring(num3, num4);
		System.out.println(st3);
	}
}
