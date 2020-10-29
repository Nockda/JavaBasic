package Game;
import java.util.Random;

public class Randomuse
{

	public static void main(String[] args)
	{
		// type 1
		Random randomV1 = new Random(); //컨트롤 + 쉬프트 + o
		
		System.out.println(randomV1.nextBoolean());
		System.out.println(randomV1.nextFloat());
		System.out.println(randomV1.nextInt(100));//range 1~99
				
		// type 2(옛날 방식)
		
		double randomV2  = Math.random();
		System.out.println("1 : " + randomV2);
		int intVal = (int)(randomV2 * 100) + 1;
		System.out.println("2 : " + intVal);
		
		// (int)(Math.random() * (최대값 - 최소값 + 1)) + 최소
	}
}
