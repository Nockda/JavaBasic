abstract class Human {
	abstract void print();
}

class Man extends Human{
	void print() {
		System.out.println("남자 생성");
	}
}

class Woman extends Human{
	void print() {
		System.out.println("여자 생성");
	}
}

public class Polymorphism3 {

	public static Human humanCreate(int kind) {
		if (kind == 1) {
			return new Man();
		}else {
			return new Woman();
		}
	}
	public static void main(String[] args) {
		
		// 생성된 휴먼이 남자인지 여자인지 중요하지 않고
		// 생성된 인간 객체의 프린트 기능만 쓸거다.
		// 남자이면 남자기능만 하고
		// 여자면 여자기능만 하고
		
		Human h1 = humanCreate(1);
		h1.print();
		
		Human h2 = humanCreate(2);
		h2.print();	
	}
}
