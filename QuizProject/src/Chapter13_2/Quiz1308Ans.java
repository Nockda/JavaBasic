//성적관리 프로그램을 작성한다.
//국어, 영어, 수학, 국사 4과목이고
//학생은 이순신, 강감찬, 을지문덕, 권율 4명이다.
//4 by 4 배열을  선언하고
//사용자로부터 4사람의 4과목 점수를 입력받아 다음의 형태로 값을 저장하고 출력



package Chapter13_2;
import java.util.Scanner;

public class Quiz1308Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sKind = { "구분", "이순신", "강감찬", "을지문덕", "권율", "총점" };
		
		int[][] nScore = new int[4][4];
		// 국어		nScore[0][0~3]
		// 영어		nScore[1][0~3]
		// 수학		nScore[2][0~3]
		// 국사		nScore[3][0~3]
		
		System.out.println("국어점수 입력");
		for(int i =0;i<4;i++) {
			nScore[0][i] = sc.nextInt();
		}
		System.out.println("영어점수 입력");
		for(int i =0;i<4;i++) {
			nScore[1][i] = sc.nextInt();
		}
		System.out.println("수학점수 입력");
		for(int i =0;i<4;i++) {
			nScore[2][i] = sc.nextInt();
		}
		System.out.println("국사점수 입력");
		for(int i =0;i<4;i++) {
			nScore[3][i] = sc.nextInt();
		}
		
		for(int i=0; i<6;i++) {
			System.out.println(sKind[i] + "\t");
		}
		System.out.println();
		
		for(int i =0; i<nScore.length; i++) {
			int nSum = 0;
			for (int j=0;j<nScore.length;j++) {
				System.out.print(nScore[i][j] + "\t");
				nSum = nSum + nScore[i][j];
			}
		System.out.print(nSum);	
		System.out.println();
		
		}
	}

}
