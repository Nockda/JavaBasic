package step01;

public class MyPhoneBook {

	public static void main(String[] args) {
		// 같은 페키지 안이라 사용가능
		PhoneInfo pInfo1 = new PhoneInfo("경수혁", "010-1234-1234", "golfmania@ga.co.kr");
		PhoneInfo pInfo2 = new PhoneInfo("정지성", "010-1234-1234");
		
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}

}
