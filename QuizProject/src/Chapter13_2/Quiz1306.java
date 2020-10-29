package Chapter13_2;


public class Quiz1306 {

	public static void main(String[] args) {
			
		int[][] arr = new int[3][9];
			
		for(int i = 0; i < 3; i++) {
			for(int j= 0; j < 9; j++) {
				arr[i][j] = (i+2) * (j+1);
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j= 0; j<9; j++) {
				System.out.print(arr[i][j] + "\t");
			}	
			System.out.println();
		}
	}
}
