abstract class Calc
{
	int a=5;
	int b=6;
	
	abstract void plus();
}

class Mycalc extends Calc
{
	void plus() {System.out.println(a+b); }
	void minus() {System.out.println(a-b);}
	
}
public class Polymorphism1 {

	public static void main(String[] args) {
		Mycalc mycalc1 = new Mycalc();
		mycalc1.plus();
		mycalc1.minus();
		
		//하위 클래스 객체를 상위클래스 객체에 대입
		Calc mycalc2 = new Mycalc();
		mycalc2.plus();
		//다음 메서드는 사용 불가
		//mycalc2.Minus();
	}

}
