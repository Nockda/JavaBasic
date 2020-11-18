import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyPhoneBook {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("[메뉴선택]\n"
				+ "1.전화번호 입력\n"
				+ "2.전화번호 조회\n"
				+ "3.전화번호 삭제\n"
				+ "4.종료\n"
				+ "선택 : ");
	}
	
	public static void main(String[] args) throws SQLException {
		
		ResultSet rs = null;
		
	int choice;
		
	try {
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"scott",
				"tiger");
		while(true) {
			StringBuffer sb = new StringBuffer();
			Statement stmt = con.createStatement();
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();					//메뉴 선택 이후에 엔터값이 다음 스케너에서 먹음 그래서 그 엔터를 먹는 스캐너가 필요
			switch(choice) {
			case 1:
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.nextLine();
				System.out.print("이메일 : ");
				String email = sc.nextLine();
					
				sb.append("insert into phoneBook ");
				sb.append(" values('"+name+"', '"+phoneNumber+"', '"+email+"')");
				stmt.executeUpdate(sb.toString());
				break;
			case 2:
				sb.setLength(0);
				System.out.print("조회 할 이름 : ");
				name = sc.nextLine();
				sb.append(" select name, phoneNumber, email from phoneBook where name = '" + name + "' ");
				rs = stmt.executeQuery(sb.toString());
				while(rs.next()) {
					System.out.print("이름 : " + rs.getString(1));
					System.out.print(", 전화번호 : " + rs.getString(2));
					System.out.println(", 이메일 : " + rs.getString(3));
				}
				break;
			case 3:
				System.out.print(" 삭제할 전화번호의 이름 : ");
				name = sc.nextLine();
					
				sb.append(" delete phoneBook ");
				sb.append(" where name = '" + name + "'");
				stmt.executeUpdate(sb.toString());
				break;
			case 4:
				sb.append(" commit ");
				stmt.executeUpdate(sb.toString());
				System.out.println("4.종료");
				con.close();
				return;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
			} catch(SQLException sqle) {
				
			}
		}
	}
}
