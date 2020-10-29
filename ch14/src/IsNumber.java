import java.util.Scanner;

public class IsNumber {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String value = kb.nextLine();
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i< value.length(); i++) {
			ch = value.charAt(i); //charAt은 케릭터 하나하나를 분리해서 가져옮
			
			if( (ch >= '0' && ch <= '9') ) {
			} else {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
		kb.close();
	}
}
