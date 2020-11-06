package PhoneBook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class NameInfor{
	// 이름 저장
	public String writename(name) {
		try(Writer out = new FileWriter("data.dat")) {
			List<String> namedata = new ArrayList<>();
			namedata.add(name);
			out.write(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String callname() {
		try(Reader in = new FileReader("data.dat")){
			return name;
		}
	}
}

class TelInfor{
	// 전번 저장
	public static String writeTel(String telNum) {
		try(Writer out = new FileWriter("data.dat")) {
			List<String> teldata = new ArrayList<>();
			teldata.add(telNum);
			out.write(telNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return telNum;
	}
}

class EmailInfor{
	// 이메일 저장
	public static String writemail(String email) {
		try(Writer out = new FileWriter("data.dat")) {
			List<String> emaildata = new ArrayList<>();
			emaildata.add(email);
			out.write(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}
}

public class PhonebookFileOut {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 메인 화면
		System.out.println("전화번호부 V1.0\n"
				+ "1. 전화번호 입력\n"
				+ "2. 전화번호 조회\n"
				+ "3. 전화번호 삭제\n"
				+ "4. 전체 리스트 조회\n"
				+ "5. 프로그램 종료");
		int mainAsr = sc.nextInt();
		
		String name = null;
		String telNum;
		String email;
		
		if(mainAsr == 1) {
			System.out.println("이름을 입력하세요.");
			name = sc.nextLine();
			NameInfor.writename();
			System.out.println("전화번호를 입력하세요.");
			telNum = sc.nextLine();
			TelInfor.writeTel(telNum);		
			System.out.println("이메일을 입력하세요.");
			email = sc.nextLine();
			EmailInfor.writemail(email);
		} else if (mainAsr == 2) {
			String callname = NameInfor.writename();
			System.out.println(callname);
			}
	}
}
