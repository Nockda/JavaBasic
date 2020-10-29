package Chapter13;
//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받는다.
//단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
//출력예시) 총 10개의 정수를 입력하시오. 결과 : 1 3 5 7 9 10 8 6 4 2


import java.util.Scanner;

public class Quiz1304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int[] cal = new int[10];
		
		for(int i = 0; i <10; i++) {
			cal[i] = sc.nextInt();
		}
		int[] div = new int[10];
		while(true) {
			for(int i = 0; i < 10; i++) {
				div[i] = cal[i] % 2;
				if(div[i] != 0) {
					System.out.print(cal[i] + " ");
				}
			}
		break;
		}
		
		StringBuilder rever = new StringBuilder();
		
		while(true) {
			for(int i = 0; i < 10; i++) {
				div[i] = cal[i] % 2;
				if(div[i] == 0) {
					System.out.print(cal[i] + " ");
				}
			}
		break;
		}
		rever.reverse();
		System.out.println(rever.toString());
	
		sc.close();
	}
	
	// 순서바꿈

}
