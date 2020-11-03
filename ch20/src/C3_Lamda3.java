interface PrintableC {
	void print(String s);
}

public class C3_Lamda3 {

	public static void main(String[] args) {
		PrintableC prn = (s) -> {System.out.println(s);};
		prn.print("What is Lamda? 3");
	}
}