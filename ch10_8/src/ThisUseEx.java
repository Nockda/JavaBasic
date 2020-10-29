// 키워드 this 사용하기
// 클래스의 은닉화
// - 변수에 직접적인 접근을 막는다.
// -getNum(getter), -setNum(setter)를 통해 변수 접근

class SimpleBox {
	private int num;
	
	SimpleBox(int num){
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num + 1;
	}
}


public class ThisUseEx {

	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(5);
		box.setNum(10);
		System.out.println(box.getNum());
	}

}
