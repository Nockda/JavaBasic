import java.util.Random;

public class StaticEx2 {

		static int num;
		
		// static 초기화 블록
		static {
			Random rand = new Random();
			num = rand.nextInt(100);
		}
		
		public static void main(String[] args) {
		System.out.println(num);

	}

}
