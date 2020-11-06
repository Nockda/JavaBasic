package step08;

public class PhoneInfo {  //impleme-- 이 있어야 저장 가능
	String name;
	String phoneNumber;
	String email;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public PhoneInfo(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void showPhoneInfo(){		// 정보만 보여주는 것
		System.out.println(name);
		System.out.println(phoneNumber);
		if(email != null && !email.equals(""))
			System.out.println(email);
		System.out.println("======================================");
	}
}
