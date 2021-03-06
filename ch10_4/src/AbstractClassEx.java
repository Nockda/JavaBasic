// 추상클래스, 추상메서드
// abstract를 쓰면 상속받은 메서드에서 꼭 오버라이딩을 해야된다.
// abstract메서드가 있는 클래스는 그 클래스 앞에 abstract라고 써야된다.
// abstract void --- ()를 하고 중괄호를 안쓴다.(내용은 안정한다는 말)


abstract class Animal {
	String name;
	int age;
	abstract void cry ();
}

class Dog extends Animal {
	String name = "멍뭉이";
	int age = 5;
	void cry() {							//abstract로 의해 꼭 오버라이딩 해야됨.
		System.out.println(name);
		System.out.println("멍멍");
		System.out.println(age + "살");
	}
}

class Cat extends Animal {
	String name = "야옹이";
	int age = 8;
	void cry() {
		System.out.println(name);
		System.out.println("야옹");
		System.out.println(age + "살");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		System.out.println();
		
		Cat cat = new Cat();
		cat.cry();
		

	}

}
