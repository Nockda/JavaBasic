import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PhoneBookDBAnswer {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	Connection con;
	PreparedStatement pstmt1;
	PreparedStatement pstmt2;
	PreparedStatement pstmt3;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		MyPhoneBook mpb = new MyPhoneBook();
		mpb.doRun();
	}
	
	public void doRun() {
		connectDatabase();
		int choice;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
