package Chapter13;
//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.

import java.util.Scanner;

public class Quiz1303 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int[] cal = new int[10];
		
		for(int i = 0; i <10; i++) {
			cal[i] = sc.nextInt();
		}
		System.out.print("짝수는 ");
		int[] div = new int[10];
		while(true) {
			for(int i = 0; i < 10; i++) {
				div[i] = cal[i] % 2;
				if(div[i] == 0) {
					System.out.print(cal[i] + ", ");
				}
			}
		System.out.print("\b\b");
		break;
		}
	
		System.out.println();
		System.out.println("------------------------------");
		System.out.print("홀수는 ");
		int[] div2 = new int[10];
		while(true) {
			for(int i = 0; i < 10; i++) {
				div2[i] = cal[i] % 2;
				if(div2[i] != 0) {
					System.out.print(cal[i] + ", ");
				}
			}
		System.out.print("\b\b");
		break;
		}
		sc.close();
	}
}
