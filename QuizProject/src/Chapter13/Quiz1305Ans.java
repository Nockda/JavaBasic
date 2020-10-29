package Chapter13;
import java.util.Scanner;

public class Quiz1305Ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요. ");
		
		String sInput = sc.nextLine();
		
		
//		// String builder 쓰기
//		StringBuilder sb = new StringBuilder(sInput);
//		String sReverse = sb.reverse().toString();
//		
//		if(sInput.equals(sReverse)) {
//			System.out.println("회문입니다.");
//		} else {
//			System.out.println("회문이 아닙니다.");
//		}
		
		
		int nLen = sInput.length();
		
		String[] myWord = new String[nLen];
		
		int nStart = 0;
		int nEnd = nLen - 1;
		boolean bMy = true;
		
		for (int i = 0; i < nLen ; i++)
		{
			myWord[i] = sInput.substring(i, i+1);
		}
		
		
		for (int i = 0; i<(nLen/2); i++) {
			if(!myWord[nStart].equals(myWord[nEnd])) {
				bMy = false;
			}
			nStart++;
			nEnd--;
		}
		
		if(bMy)
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");	
	}
}
