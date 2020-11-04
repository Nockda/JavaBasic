interface HowLong{
	int len(String s);
}
public class E4_OneParamAndReturn {

	public static void main(String[] args) {
		HowLong hl = s -> s.length();
		// int num = hl.len("I am so happy");
		System.out.println(hl.len("I am so happy"));
	}
}
