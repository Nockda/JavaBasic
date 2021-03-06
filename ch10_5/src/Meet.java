// 인터페이스
// 추상클래스와 인터페이스 차이
// 추상클래스는 1대 2대 3대 계통이 중요할 때 씀
// 인터페이스는 앞과 뒤가 큰 연관없는 특별한 기능을 쓸때

// 인터페이스는 무조건 추상메소드만 씀. 일반 메소드는 쓸 수 없음.

interface Greet
{
	void greet();
}

interface Talk
{
	void talk();
}

class Morning implements Greet, Talk
{
	public void greet()
	{
		System.out.println("안녕하세요.");
	}
	
	public void talk()
	{
		System.out.println("날씨가 좋네여");
	}
}


public class Meet {

	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.greet();
		morning.talk();

	}
}
