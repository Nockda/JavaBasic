package step08;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MyPhoneBook {
	
	static Scanner sc = new Scanner(System.in);
	static Map<String, PhoneInfo> map = new HashMap<>();
	
	public static void readInfo() {
		try(ObjectInputStream oi =
				new ObjectInputStream(new FileInputStream("PhoneBook.bin"))) {
		
			while(true) {
				PhoneInfo pInfo = (PhoneInfo) oi.readObject();
				if(pInfo == null)
				break;
			map.put(pInfo.name, pInfo);
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		catch (IOException e) {
			//e.printStackTrace();		//EOFException은 end of file. 처음 시작할때 나는 에러.
		}	
	}
	
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
		System.out.print("삭제할 전화번호의 이름 : ");
		String name = sc.nextLine();
		
		PhoneInfo pInfo = map.remove(name);
		if(pInfo != null)
			System.out.println(pInfo + "의 정보가 삭제되었습니다.");
		else
			System.out.println(name + "의 정보가 없습니다.");
	}
	
	public static void saveInfo() {
		try(BufferedWriter bw =
				new BufferedWriter(new FileWriter("phone_data.csv"))) {
			Set<String> ks = map.keySet();
			for(String s : ks) {
				PhoneInfo pInfo = map.get(s);
				String str = "\"" + pInfo.name + "\"," +
							"\"" + pInfo.phoneNumber + "\"," +
							"\"" + pInfo.email + "\"";
				bw.write(str);
				bw.newLine();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		// readInfo();
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
				saveInfo();
				System.out.println("4.종료");
				return;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
}
