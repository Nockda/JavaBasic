class Apple4 {
	public String toString() {
		return"I am apple";
	}
}

class Orange4 {
	public String toString() {
		return"I am Orange";
	}
}

class Box4{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}


public class A4_FruitAndBoxFault2 {

	public static void main(String[] args) {
		
		//과일 담는 박스 생성
		Box4 aBox = new Box4();
		Box4 oBox = new Box4();
			
		//과일을 박스에 담는다.
		aBox.set("Apple");
		oBox.set("Orang");
				
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}

