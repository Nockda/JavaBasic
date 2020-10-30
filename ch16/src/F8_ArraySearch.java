import java.util.Arrays;

public class F8_ArraySearch {

	public static void main(String[] args) {
		int[] ar = {33, 44, 11, 55, 22};
		
		Arrays.sort(ar);
		for(int n : ar) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		int idx = Arrays.binarySearch(ar, 22);
		System.out.println("index of 22 : " + idx);

	}

}
