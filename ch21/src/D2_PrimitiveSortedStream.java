import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class D2_PrimitiveSortedStream {

	public static void main(String[] args) {
		IntStream.of(3,9,4,2)
				.sorted()	
				.forEach(d -> System.out.print(d + "\t"));
		System.out.println();
		
		DoubleStream.of(3.3, 6.3, 1.6, 9.4)
					.sorted()	
					.forEach(d-> System.out.print(d + "\t"));
		System.out.println();
	}
}
