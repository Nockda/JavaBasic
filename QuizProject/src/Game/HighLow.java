package Game;

import java.util.Random;
import java.util.Scanner;

// 1. 컴퓨터가 낸 숫자를 맞춘다.
// 2. 기회는 6번
// 3. 숫자 맞추거나 기회가 다 소진되면 다시 할건지 물어봄.(y/n)

public class HighLow {

	public static void main(String[] args) {
		
		Random random1 = new Random();
		int key = random1.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 100까지 업앤다운~\n기회는 6번!!");
		
		while(true) {
			for(int i = 6; i > 0; i--) {
				int x = sc.nextInt();
				if(x == key) {
					System.out.println("정답 !\n다시 할래?");
					String str = sc.next();
					if(!str.equalsIgnoreCase("y")) {
						System.out.println("good bye~");
						break;
					}else {
						System.out.println("1부터 100까지 업앤다운~\n기회는 6번!!");
						continue;
					}
				} else if(x > key){
					System.out.println("다운 !");
					break;
				} else {
					System.out.println("업 !");
					break;
				}
			}
		}
	}
}

