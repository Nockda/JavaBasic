import java.util.Arrays;

public class B2_StringStream2 {

	public static void main(String[] args) {
		String[] names = {"YOON", "LEE", "PARK"};
		
		//스트림 생성
		Arrays.stream(names)
				.forEach(s->System.out.print(s + "\t"));
	}
}
