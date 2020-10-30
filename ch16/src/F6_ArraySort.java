import java.util.Arrays;

public class F6_ArraySort {

	public static void main(String[] args) {
		int[] ar1 = {1,4,3,5,2};
		double[] ar2 = {1.1, 3.3, 2.2, 5.5, 4.4};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int n : ar1)
			System.out.print(n + "\t");
		System.out.println();
		
		for(double d : ar2)
			System.out.print(d + "\t");
		System.out.println();
	}

}
