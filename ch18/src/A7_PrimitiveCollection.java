import java.util.Iterator;
import java.util.LinkedList;

public class A7_PrimitiveCollection {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		// 저장과정에서 오토 박싱
		list.add(10);
		list.add(20);
		list.add(30);
		
		// ArrayList<integer> list2 = new ArrayList<>(list); //<--에러안남
		// ArrayList<Integer> list3 = list; <--에러 남
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next();
		System.out.print(n + "\t");
		}
		System.out.println();
	}
}
