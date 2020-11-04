interface PrintableD{
	void print(String s);
}

public class E1_OneParamNoReturn {

	public static void main(String[] args) {
		PrintableD p;
		
		p=(String s) -> {System.out.println(s);};
		p.print("Lamda exp one.");
		
		p = (String s) -> System.out.println(s);
		p.print("lamda exp two");
		
		p = (s) -> System.out.println(s);
		p.print("lamda exp three");
		
		p = s -> System.out.println(s);
		p.print("lamda exp four");
		
	}

}
