import java.util.Arrays;
import java.util.List;

public class C3_MapToInt2 {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		
		// 데이터를 길이로 매핑하고, 그 숫자를 출력
		ls.stream()
			.mapToInt(s->s.length())
			.forEach(s->System.out.print(s+"\t"));
		
		System.out.println();
	}
}
