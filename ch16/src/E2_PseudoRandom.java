import java.util.Random;

public class E2_PseudoRandom {

	public static void main(String[] args) {
		Random rad = new Random(12);
		
		for(int i = 0; i < 7; i++) {
			System.out.print(rad.nextInt(10) + " ");
		}

	}

}
