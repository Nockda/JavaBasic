
public class A1_ArrayIsInstance {

	public static void main(String[] args) {
		// 1차원 배열. -> 힙에 미리 메모리의 칸을 생성해놓음
		// 정해진 칸수로만 쓸 수 있고 더 추가하거나 삭제할 수 없어서 새로 만들어야댐
		// 스택에서 만들어 쓰는 것은 연산자를 쓸 수 없고, 힙에서 1차원 배열한건 쓸 수 있음
		
		//길이가 5인 int형 1차원 배열의 생성
		int[] ar1 = new int[5];
		
		// 길이가 7인 double형 1차원 배열의 생성
		double[] ar2 = new double[7];
		
		// 배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float[9];
		
		// 배열의 인스턴스 변수 접근
		System.out.println("배열 ar1 길이 : " + ar1.length);
		System.out.println("배열 ar2 길이 : " + ar2.length);		
		System.out.println("배열 ar3 길이 : " + ar3.length);
	}
}
