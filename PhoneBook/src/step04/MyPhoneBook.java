package step04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import step03.PhoneInfo;

public class MyPhoneBook {
	
	static Scanner sc = new Scanner(System.in);
	static Map<String, PhoneInfo> map = new HashMap<>();
	
	public static void showMenu() {
		System.out.println("[메뉴선택]\n"
				+ "1.전화번호 입력\n"
				+ "2.전화번호 조회\n"
				+ "3.전화번호 삭제\n"
				+ "4.종료\n"
				+ "선택 : ");
	}
	
	public static void addNumber() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		PhoneInfo pInfo;
		if(email != null && !email.equals("")) {
			pInfo = new PhoneInfo(name, phoneNumber, email);
		} else
			pInfo = new PhoneInfo(name, phoneNumber);
		pInfo.showPhoneInfo();
		map.put(name, pInfo);
		System.out.println("맵의 크기 : " + map.size());
	}
	
	public static void selNumber() {
		System.out.print("조회 할 이름 : ");
		String name = sc.nextLine();
		
		Set<String> ks = map.keySet(); 								// 전체 이름 조회[디버그용]
		for(String s : ks)
			System.out.println(map.get(s).toString());
		System.out.println("-----------------------");
		
		PhoneInfo pInfo = map.get(name);
		
		if(pInfo != null)
			pInfo.showPhoneInfo();
		else
			System.out.println("[" + name + "] 의 데이터가 없습니다.");
	}
	
	public static void delNumber() {
		System.out.println("3.전화번호 삭제");
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();					//메뉴 선택 이후에 엔터값이 다음 스케너에서 먹음 그래서 그 엔터를 먹는 스캐너가 필요
			switch(choice) {
			case 1:
				addNumber();
				break;
			case 2:
				selNumber();
				break;
			case 3:
				delNumber();
				break;
			case 4:
				System.out.println("4.종료");
				return;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
}
