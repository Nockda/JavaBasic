
public class B2_SubString {

	public static void main(String[] args) {
		
		// subString 은 앞에서부터 자를수밖에 없음.
		// 만약에 뒤에서부터 자르려면 거꾸로 돌려서 자르고 다시 거꾸로 돌려놓음
		String st1 = "abcdefg";
				
		String st2 = st1.substring(2);
		System.out.println(st2);
		
		String st3 = st1.substring(2,4);
		System.out.println(st3);

	}

}
