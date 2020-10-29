class Animal
{
	String name;
	int age;
	
	void printPet()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Cat extends Animal
{
	String variety;
	
	void printPet()
	{
		super.printPet();
		System.out.println("종류 : " + variety);
	}
	void printPet2()			// 부모것만 찍고싶다고 하면 따로 만들어야됨.
	{							// 상속받은 것은 알 수 없음.
		super.printPet();
	}
}

public class Pet {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.name = "양순이";
		cat.age = 5;
		cat.variety = "페르시안";
		cat.printPet();					//오버라이딩
		System.out.println();
		cat.printPet2();				//부모클래스 printPet쓰기
	}
}
