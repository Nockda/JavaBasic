package Game;

import java.util.Random;
import java.util.Scanner;

public class MindReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0부터 100까지 값중에 한가지를 생각해주세요.");
		System.out.println("제가 제시한 숫자가 당신의 것보다 크면 h를 눌러주세요.");
		System.out.println("제가 제시한 숫자가 당신의 것보다 작으면 l를 눌러주세요.");
		System.out.println("제가 숫자를 맞췄다면 y를 입력해주세요.");

		int nMax = 100;
		int nMin = 1;
		
		for(int i=0; i<6; i++) {
			int comNum = (nMax + nMin)/2;
			System.out.println("[" + comNum + "]" + "이 숫자가 맞나요?");
			String answer = sc.next();
			if (answer.equals("y")){
				System.out.println(i + "회차로 끝났다~~");
				break;
			} else if (answer.equals("h")) {
				nMin = comNum;
			} else if (answer.equals("l")) {
				nMax = comNum;
			}
		}
	}
}
