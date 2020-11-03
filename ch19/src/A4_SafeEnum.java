enum Animal2{DOG, CAT}
enum Person2{MAN, WOMAN}


public class A4_SafeEnum {

	public static void main(String[] args) {

		who(Person2.MAN);
		//who(Animal2.DOG);			// 컴파일 오류로 걸러냄
	}
		
	public static void who(Person2 MAN) {
		switch(MAN) {
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
}