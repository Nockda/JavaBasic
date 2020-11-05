package PhoneBook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PhonebookFileOut {
	
	public static void readInfo() {
		try(Writer out = new FileWriter("info.txt")) {
			HashMap<Integer, String, String, String> info = new HashMap<>();
			for(i)
			map.put(i, name, telNum, email);
			
			out.write(name);
			out.write(telNum);
			out.write(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i= 0; i<50; i++)
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("전화번호부 V1.0\n"
				+ "1. 전화번호 입력\n"
				+ "2. 전화번호 조회\n"
				+ "3. 전화번호 삭제\n"
				+ "4. 전체 리스트 조회\n"
				+ "5. 프로그램 종료");
		String name;
		String telNum;
		String email;
		
		int mainAsr = sc.nextInt();
		
		if(mainAsr == 1) {
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			System.out.println("전화번호를 입력하세요.");
			telNum = sc.nextLine();
			System.out.println("이메일을 입력하세요.");
			email = sc.nextLine();
		} else if (mainAsr == 2) {
			try(Reader in = new FileReader("info.txt")){
				System.out.println("이름 : " + name);
				System.out.println("전화번호 : " + telNum);
				System.out.println("이메일 : " + email);
			}
		}
		
//		try(Writer out = new FileWriter("info.txt")){
//			
//		}
	}
}
