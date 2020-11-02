import java.util.HashSet;

class Num2 {
	private int num;
	
	public Num2(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return hashCode() + " " + num;
	}
	// 해쉬코드를 3개로 정의하겠다.
	@Override
	public int hashCode() {
		return num % 3;
	}
	// 그 해쉬코드의 내용은 이렇다.
	@Override
	public boolean equals(Object obj) {
		if(num == ((Num2)obj).num)
			return true;
		else
			return false;
	}
}
public class B3_HashSetEqualityTwo {

	public static void main(String[] args) {
		HashSet<Num2> set = new HashSet<>();
		set.add(new Num2(7799));
		set.add(new Num2(9955));
		set.add(new Num2(7799));
		
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Num2 n : set)
			System.out.println(n.toString() + '\t');
		
		System.out.println();

	}

}
