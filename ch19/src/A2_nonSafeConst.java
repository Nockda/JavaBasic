interface Animal1 {
	int DOG = 1;
	int CAT = 2;
}
interface Person1 {
	int MAN = 1;
	int WOMAN = 2;
}

public class A2_nonSafeConst {

	public static void main(String[] args) {
		who(Person1.MAN);
		who(Animal1.DOG);			// 결과값에서 잘못된 결과가 나옴
	}
	
	public static void who(int man) {
		switch(man) {
		case Person1.MAN:
			System.out.println("남성 손님입니다.");
			break;
		case Person1.WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}

}
