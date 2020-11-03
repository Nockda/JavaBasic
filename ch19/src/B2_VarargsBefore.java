// 실제로 시스템에서는 이렇게 바꿔서 결과도출

public class B2_VarargsBefore {
	public static void showAll(String[] vargs) {
		System.out.println("len : " + vargs.length);
		
		for(String s : vargs)
			System.out.print(s + '\t');
		System.out.println();
	}
	
	public static void main(String[] args) {
		showAll(new String[]{"Box"});
		showAll(new String[]{"Box", "Toy"});
		showAll(new String[]{"Box", "Toy", "Apple"});
	}
}