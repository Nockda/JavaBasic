import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) { 
		return s1.compareToIgnoreCase(s2);
	}
}


public class F3_StringComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		list.add("apple");
		list.add("ZEro");
		
		StrComp cmp = new StrComp();
		
		System.out.println("정렬 전 : " + list);
		
		Collections.sort(list, cmp);
		int idx =Collections.binarySearch(list, "apple", cmp);
		System.out.print("정렬 후 : ");
		for(String s : list) {
			System.out.print(s + '\t');
		}
		System.out.println();
		
		System.out.println(list.get(idx));
		System.out.println(idx);

	}

}
