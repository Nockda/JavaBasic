class Apple6 {
	public String toString() {
		return"I am apple";
	}
}

class Orange6 {
	public String toString() {
		return"I am Orange";
	}
}

class Box6<T>{
	private T ob;
	
	public void set(T o) {
		ob= o;
	}
	
	public T get() {
		return ob;
	}
}

public class A6_FruitAndBoxFault_Generic {

	public static void main(String[] args) {
		Box6<Apple6> aBox = new Box6<Apple6>();
		Box6<Orange6> oBox = new Box6<Orange6>();
		
//		아래처럼 글자를 담으면 오류
//		aBox.set("Apple");
//		oBox.set("Orange");
		
		Apple6 ap = aBox.get();
		Orange6 og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);

	}

}
