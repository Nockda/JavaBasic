class Apple3 {
	public String toString() {
		return"I am apple";
	}
}

class Orange3 {
	public String toString() {
		return"I am Orange";
	}
}

class Box3{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}


public class A3_FruitAndBoxFault {

	public static void main(String[] args) {
		
		//과일 담는 박스 생성
		Box2 aBox = new Box2();
		Box2 oBox = new Box2();
			
		//과일을 박스에 담는다.
		aBox.set("Apple");
		oBox.set("Orang");

				
		// 과일을 박스에서 꺼낸다.
		Apple3 ap = (Apple3)aBox.get();
		Orange3 og = (Orange3)oBox.get();
				
		System.out.println(ap);
		System.out.println(og);
	}

}

