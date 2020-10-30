import java.util.Random;

public class E1_SeedSetRandom {

	public static void main(String[] args) {
		Random rad = new Random(System.currentTimeMillis());
		
		for(int i = 0; i<7; i++) {
			System.out.print(rad.nextInt(10) + " ");
		}
		System.out.println();
	}
}
