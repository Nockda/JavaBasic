import java.util.StringTokenizer;

public class C2_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer v = new StringTokenizer("a b c");
		StringTokenizer n = new StringTokenizer("1 2 3");
		
		String s = v.nextToken();
		int num = Integer.parseInt(n.nextToken());
		int sum = num;
		
		while (v.hasMoreTokens())
		{
			s = s + "+" + (v.nextToken());
			sum = sum + Integer.parseInt(n.nextToken());
		}
		System.out.println(s + "=" + sum);
	
		String str1 = "홍길동, 20, 010-123-4567, \"종로구, 관철동\"";
		str1 = str1.replace(", ", " ");
		str1 = str1.replace("\"", " ");
		
		StringTokenizer st = new StringTokenizer(str1, ",");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	
	
	
	
	}
}
