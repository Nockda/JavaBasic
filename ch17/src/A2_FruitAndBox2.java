class Apple2 {
	public String toString() {
		return"I am apple";
	}
}

class Orange2 {
	public String toString() {
		return"I am Orange";
	}
}

class Box2{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}

public class A2_FruitAndBox2 {

	public static void main(String[] args) {
		
		//과일 담는 박스 생성
		Box2 aBox = new Box2();
		Box2 oBox = new Box2();
		
		//과일을 박스에 담는다.
		aBox.set(new Apple1 ());
		oBox.set(new Orange1 ());

		
		// 과일을 박스에서 꺼낸다.
		Apple2 ap = (Apple2)aBox.get();
		Orange2 og = (Orange2)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
