interface Printable{
	void print(String doc);
}

class PrnDrvSamsung implements Printable {
	public void print(String doc) {
		System.out.println(doc + "\nForm Samsung : Black-White Ver");
	}
}

class PrnDrvEpson implements Printable{
	public void print(String doc) {
		System.out.println(doc + "\nForm Epson : Black-White Ver");
	}
}

public class Polymorphism4_1 {

	public static void main(String[] args) {
		String doc = "프린터로 출력을 합니다.";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		
		Printable prn2 = new PrnDrvEpson();
		prn2.print(doc);

	}

}
