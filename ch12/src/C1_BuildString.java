
public class C1_BuildString {

	public static void main(String[] args) {
		// String builder의 기능
		
		StringBuilder stb = new StringBuilder("123");
		
		// 123 뒤에 45678을 붙여라
		stb.append(45678);
		System.out.println(stb.toString());
		
		//0에서 2까지 지워라
		stb.delete(0, 2);
		System.out.println(stb.toString());
		
		// 0에서 3까지 숫자를 ab로 대체해라
		stb.replace(0, 3, "ab");
		System.out.println(stb.toString());
		
		// 뒤집어라
		stb.reverse();
		System.out.println(stb.toString());
		
		// 2부터 4까지 숫자
		String sub = stb.substring(2,4);
		System.out.println(sub);
	}
}
