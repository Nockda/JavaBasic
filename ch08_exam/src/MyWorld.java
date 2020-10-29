class 사람
{
	String 이름;
	int 나이;
	int 키;
	
	void 인사() {
		System.out.println("안녕하세요.");
	}
}

public class MyWorld
{
	public static void main(String[] args)
	{
		// 사람이란 설계도(class)를 이용하여 사람(객체) 만들기
		// 진짜 사람이 태어나면 지구에 사는 것.
		// 객체가 만들어지면, 메모리에 적재됨.
		
		사람 man1 = new 사람();
		
		man1.이름 = "홍길동";
		man1.나이 = 20;
		man1.키 = 170;
		
		man1.인사();
		System.out.println(man1.이름);
	}
}