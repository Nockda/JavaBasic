interface PrintableA {
	void print(String s);
}

class PrinterA implements PrintableA{
	public void print(String s) {
		System.out.println(s);
	}
}

public class C1_Lamda1 {

	public static void main(String[] args) {
		PrintableA prn = new PrinterA();
		prn.print("what is Lamda?");
	}
}
