//우선 아래와 같은 형태의 좌측배열 A를 선언한다.
//그리고 A배열의 초기값을 이용해서 우측배열 B를 초기화하는 프로그램을 작성하시오 --> 그림을 그려서 해볼것 i , j 값
/*
 B    <---   A
1 2			1 2 3 4
3 4         5 6 7 8  
5 6
7 8
 */


package Chapter13_2;

public class Quiz1307 {

	public static void main(String[] args) {
		int[][] array = new int[2][4];
		
		
		// A 형태
		int num = 1;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				array[i][j] = num;
				num++;
				//System.out.print(array[i][j] + " ");
			}
			//System.out.println();
		}
		
		// B 형태
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 2; i++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
