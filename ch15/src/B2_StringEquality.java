
public class B2_StringEquality {

	public static void main(String[] args) {
		String str1 = new String("so Simple");
		String str2 = new String("so Simple");
		
		// 참조 대상을 비교하는 if~else문
		if(str1==str2) {
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		
		if(str1.equals(str2))
			System.out.println("동일");
		else {
			System.out.println("다름");
		}
	}

}
