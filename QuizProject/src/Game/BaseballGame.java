package Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		// 컴터 정답 만들기
				
		int key1 = random.nextInt(9)+1;
		int key2 = random.nextInt(9)+1;
		int key3 = random.nextInt(9)+1;
		
		while(true) {
			if(key1 == key2) {
				key2 = random.nextInt(9)+1;
			} else if(key3 == key1 | key3 == key2) {
				key3 = random.nextInt(9)+1;
			}
			break;
			int[] nKey1 = new int[key1];
			int[] nKey2 = new int[key2];
			int[] nKey3 = new int[key3];
			System.out.println();
		}
		
		// 입력받고 검사하기
		
		while(true) {
			int answer = sc.nextInt();
			if(answer < 102 || answer > 987) {
				System.out.println("다시 3자리 숫자를 정확히 입력해주세요.");
			} else {
				int[] ar = {key1, key2, key3};
				int[] ans1 = new int[1];
				int[] ans2 = new int[1];
				int[] ans3 = new int[1];
				if() {
					System.out.println();
				}
				break;
			}
		}
		
		
	}

}
