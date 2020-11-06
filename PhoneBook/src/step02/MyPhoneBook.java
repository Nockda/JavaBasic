package step02;

import java.util.Scanner;

public class MyPhoneBook {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("[메뉴선택]\n"
				+ "1.전화번호 입력\n"
				+ "2.전화번호 조회\n"
				+ "3.전화번호 삭제\n"
				+ "4.종료\n"
				+ "선택 : ");
	}
	
	public static void addNumber() {
		System.out.println("1.전화번호 입력");
	}
	
	public static void selNumber() {
		System.out.println("2.전화번호 조회");
	}
	
	public static void delNumber() {
		System.out.println("3.전화번호 삭제");
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
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
