@FunctionalInterface
interface PrintableE {
	void print (String s);
}

public class E6_LamdaParam {
	
	public static void ShowString(PrintableE p, String s) {
		p.print(s);
	}
	
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "what is Lamda");
	}
}
