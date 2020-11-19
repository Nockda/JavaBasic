import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		PhoneBookDBAnswer mpb = new PhoneBookDBAnswer();
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
				end();
				return;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void showMenu() {
		System.out.println("[메뉴선택]\n"
				+ "1.전화번호 입력\n"
				+ "2.전화번호 조회\n"
				+ "3.전화번호 삭제\n"
				+ "4.종료\n"
				+ "선택 : ");
	}
	
	public void addNumber() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		String sql = "insert into PhoneBook values(?, ?, ?)";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, name);
			pstmt1.setString(2, phoneNumber);
			pstmt1.setString(3, email);
			pstmt1.executeUpdate();
			System.out.println("데이터베이스에 추가되었습니다.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void selNumber() {
		System.out.print("조회 할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "select + from PhoneBook where name = ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, name);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				System.out.println("name : " + rs.getString(1));
				System.out.println("phoneNumber : " + rs.getString(2));
				if (rs.getString(3)!=null) {
					System.out.println("email : " + rs.getString(3));
				}
			}else {
				System.out.println("해당 값이 없습니다.");
			}
			rs.close();
		}catch (Exception e) {
			System.out.println("알수없는 에러가 났습니다.");
		}
	}
	
	public void delNumber() {
		System.out.println("삭제할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "delete from PhoneBook where name = ?";
		try {
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, name);
			pstmt3.executeUpdate();
			System.out.println("데이터베이스에서 삭제되었습니다.");
		} catch (Exception e) {
			System.out.println("데이터베이스 삭제 에러입니다.");
		}
	}
	
	public void connectDatabase() {
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void end() {
		try {
			con.close();
			System.out.println("프로그램을 종료합니다.");
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
