
public class A3_CompString {

	public static void main(String[] args) {
		String st1 = "A";
		String st2 = "B";
		int cmp;
		
		// 인스턴스 내용 비교
		// equals는 안의 문자 내용이 같은지를 비교(힙안에 있는 내용비교)
		
		if(st1.equals(st2))
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
		
		
		// compareto는 일치 하는것뿐만 아니라 정렬하여 앞인지 뒤인지까지 알 수 있다.
		cmp = st1.compareTo(st2);
		
		if (cmp == 0)
			System.out.println("두 문자열은 같습니다.");
		else if (cmp < 0)
			System.out.println("사전의 앞의 위치하는 문자 : "  + st1);
		else
			System.out.println("사전의 앞의 위치하는 문자 : "  + st2);
		
		// compareToIgnoreCase는 정렬하여 비교하지만, 대소문자 구분X
		if(st1.compareToIgnoreCase(st2) ==0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
	}

}
