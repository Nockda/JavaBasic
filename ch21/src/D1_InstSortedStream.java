import java.util.stream.Stream;

public class D1_InstSortedStream {

	public static void main(String[] args) {
		Stream.of("Box", "Robot", "Toy", "Apple")
				.sorted()	
				.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		Stream.of("Box", "Robot", "Toy", "Apple")
				.sorted((s1, s2) -> s1.length() - s2.length())
				.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		Stream.of("Box", "Robot", "Toy", "Apple")
				.sorted((s1, s2) -> s2.length() - s1.length())
				.forEach(s->System.out.print(s + "\t"));
		System.out.println();
	}
}
