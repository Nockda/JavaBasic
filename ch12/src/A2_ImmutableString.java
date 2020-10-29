
public class A2_ImmutableString {

	public static void main(String[] args) {
		String str1 = "the Best String";
		String str2 = "the Best String";

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		// 인스턴스 참조 값 비교
		// str1과 str2는 id 19로 주소값이 같음.
		// ==은 id 주소값이 같은지를 비교하는 것
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if (str3 == str4)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
	}

}
