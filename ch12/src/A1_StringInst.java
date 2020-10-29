
public class A1_StringInst {

	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		// 둘다 string 인스턴스의 생성으로 이어짐
		// 그 결과 인스턴스의 참조 값이 반환됨
		// debug 모드로 id 살펴보기
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		String str3 = "The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length());
		
		System.out.println(); 			//개행
		
		System.out.println(str2);
		System.out.println(str2.length());
		
		System.out.println();
		
		showString("Funny String");
		showString(str3);
	}
}