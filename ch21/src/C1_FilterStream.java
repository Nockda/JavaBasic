import java.util.Arrays;
import java.util.List;

public class C1_FilterStream {

	public static void main(String[] args) {
		
		// 홀수만 빼내기
		int[] ar = {1,2,3,4,5};
		Arrays.stream(ar)
				.filter(n->n%2 == 1)
				.forEach(n->System.out.print(n + "\t"));
		System.out.println();
		
		// 3글자만 빼내기
		List<String> s1 = Arrays.asList("Toy", "Robot", "Box");
		s1.stream()
			.filter(s-> s.length() ==3)
			.forEach(s ->System.out.print(s + "\t"));
		System.out.println();

	}

}
