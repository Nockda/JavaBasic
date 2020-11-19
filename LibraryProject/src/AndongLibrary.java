import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AndongLibrary {

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
	PreparedStatement pstmt4;
	PreparedStatement pstmt5;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		AndongLibrary mpb = new AndongLibrary();
		mpb.doRun();
	}
	
	public void doRun() {
		connectDatabase();
		int choice;
		
		
		while(true) {
			showMenu1();				//메인메뉴
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				showMenu2();
				subMenu1();
				break;
			case 2:
				showMenu3();
				subMenu2();
				break;
			case 3:
				showMenu4();
				subMenu3();
				break;
			case 4:
				end();
				return;
			default :
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void subMenu1() {				//회원관련서브메뉴
		int choice;
		choice = sc.nextInt();
		String less = sc.nextLine();
		switch(choice) {
		case 1:
			showMenu1();
			return;
		case 2:
			addClient();
			break;
		case 3:
			inquireClient();
			break;
		case 4:
			delClient();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void subMenu2() {					//도서관련서브메뉴
		int choice;
		choice = sc.nextInt();
		String less = sc.nextLine();
		switch(choice) {
		case 1:
			showMenu1();
			return;
		case 2:
			addBook();
			break;
		case 3:
			inquireBook();
			break;
		case 4:
			changeBookStatus();
			break;
		case 5:
			delBook();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void subMenu3() {				//대출관련서브메뉴
		int choice;
		choice = sc.nextInt();
		String less = sc.nextLine();
		switch(choice) {
		case 1:
			showMenu1();
			return;
		case 2:
			borrowBook();
			break;
		case 3:
			returnBook();
			break;
		case 4:
			inquireBook();
			break;
		case 5:
			inquireOverdue();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void showMenu1() {
		System.out.println("====================================================="
				+ "\n[메뉴선택]\n"
				+ "1.회원 관련\n"
				+ "2.도서 관련\n"
				+ "3.대출 관련\n"
				+ "4.종료\n"
				+ "선택 : ");
	}
	
	public void showMenu2() {
		System.out.println("====================================================="
				+ "\n[회원관련]\n"
				+ "1.<< 뒤로가기\n"
				+ "2.신규회원가입\n"
				+ "3.회원정보조회\n"
				+ "4.회원탈퇴\n"
				+ "선택 : ");
	}
	
	public void showMenu3() {
		System.out.println("====================================================="
				+ "\n[도서관련]\n"
				+ "1.<< 뒤로가기\n"
				+ "2.신규도서등록\n"
				+ "3.배가상태변경\n"
				+ "4.도서폐기\n"
				+ "선택 : ");
	}
	
	public void showMenu4() {
		System.out.println("====================================================="
				+ "\n[대출관련]\n"
				+ "1.<< 뒤로가기\n"
				+ "2.도서대출\n"
				+ "3.도서반납\n"
				+ "4.도서조회\n"
				+ "5.연체조회\n"
				+ "선택 : ");
	}
	
	public void addClient() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일(yyyy.mm.dd) : ");
		String birth = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		String sql = "insert into List values(?, ?, ?, ?, ?, ?, ?, client_seq.nextval)";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, id);
			pstmt1.setString(2, name);
			pstmt1.setString(3, birth);
			pstmt1.setString(4, phoneNumber);
			pstmt1.setString(5, address);
			pstmt1.setString(6, email);
			pstmt1.setString(7, "");
			pstmt1.executeUpdate();
			System.out.println("데이터베이스에 추가되었습니다.");
		} catch(SQLIntegrityConstraintViolationException uni) {
			System.out.println("중복된 아이디가 있습니다. 다른 아이디를 입력해주세요.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void inquireClient() {
		System.out.print("\n조회 할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "select * from List where 이름 = ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, name);
			ResultSet rs = pstmt2.executeQuery();
			System.out.println("==================================================");
			if(rs.next()) {
				System.out.println("조회하신 " + name + "의 정보는 아래와 같습니다.\n");
				System.out.println("ID : " + rs.getString(1));
				System.out.println("이름 : " + rs.getString(2));
				System.out.println("전화번호 : " + rs.getString(3));
				System.out.println("생년월일 : " + rs.getString(4));
				System.out.println("주소 : " + rs.getString(5));
				System.out.println("이메일 : " + rs.getString(6));
				System.out.println();
			}else {
				System.out.println("조회하신 이름의 데이터가 없습니다.");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
	}
	
	public void delClient() {
		System.out.println("삭제할 이름 : ");
		String name = sc.nextLine();
		
		String sql = "delete from List where 이름 = ?";
		try {
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, name);
			pstmt3.executeUpdate();
			System.out.println("데이터베이스에서 " + name + "님의 데이터가 삭제되었습니다.");
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
	
	public void addBook() {
		System.out.print("등록번호 : ");
		String bookId = sc.nextLine();
		System.out.print("배가상태 : ");
		String location = sc.nextLine();
		System.out.print("도서명 : ");
		String bookName = sc.nextLine();
		System.out.print("저작자 : ");
		String author = sc.nextLine();
		System.out.print("발행년 : ");
		String issueYear = sc.nextLine();
		System.out.print("가격 : ");
		String bookPrice = sc.nextLine();
		System.out.print("입고날짜 : ");
		String arraivalDate = sc.nextLine();
		
		String sql = "insert into List values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, bookId);
			pstmt1.setString(2, location);
			pstmt1.setString(3, bookName);
			pstmt1.setString(4, author);
			pstmt1.setString(5, issueYear);
			pstmt1.setString(6, bookPrice);
			pstmt1.setString(7, arraivalDate);
			pstmt1.executeUpdate();
			System.out.println("데이터베이스에 " + bookName + "의 데이터가 추가되었습니다.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void changeBookStatus() {
		System.out.print("상태값 종류 : 관외대출자료, 분실자료, 비치자료, 재정리자료");
		System.out.print("등록번호 : ");
		String bookId = sc.nextLine();
		System.out.print("배가상태 : ");
		String location = sc.nextLine();
		
		String sql = "update booklist set 배가상태 = ? where 등록번호 = ?";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, bookId);
			pstmt1.setString(2, location);
			pstmt1.executeUpdate();
			System.out.println(bookId + "가 " + location + "으로 상태가 변경되었습니다.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void delBook() {
		System.out.println("삭제할 책 등록번호 : ");
		String delBookId = sc.nextLine();
		
		String sql = "delete from BookList where 등록번호 = ?";
		try {
			pstmt3 = con.prepareStatement(sql);
			pstmt3.setString(1, delBookId);
			pstmt3.executeUpdate();
			System.out.println("데이터베이스에서 " + delBookId + "님의 데이터가 삭제되었습니다.");
		} catch (Exception e) {
			System.out.println("데이터베이스 삭제 에러입니다.");
		}
	}
	
	
	
	public void borrowBook() {
		System.out.print("도서등록번호 : ");
		String bookId = sc.nextLine();
		System.out.print("대여자 ID : ");
		String id = sc.nextLine();
		
		String sql = "insert into Status values(B_SEQ.nextval, ?, ?, sysdate, ?, ?)";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, bookId);
			pstmt1.setString(2, id);
			pstmt1.setString(3, "");
			pstmt1.setString(4, "");
			pstmt1.executeUpdate();
			System.out.println("대여가 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void returnBook() {								//반납 해결 안됨.
		System.out.print("도서등록번호 : ");
		String bookId = sc.nextLine();
				try {
					String check = "update status set 연체날짜 = to_date(sysdate, yyyy mm dd) where 도서등록번호 = ?";
					pstmt4 = con.prepareStatement(check);
					pstmt4.setString(1, bookId);
					pstmt4.executeUpdate();
					String check2 = "update status set 연체날짜 = round(반납날짜 - 대여날짜) where 도서등록번호 = "+ "'"+ bookId + "'";
					pstmt5 = con.prepareStatement(check2);
					pstmt5.executeUpdate();
					
					System.out.println(bookId + "의 반납이 완료되었습니다.");
					
				} catch (InputMismatchException er) {
					System.out.println("반납 목록에 없습니다. 다시 확인해주세요.");
					er.printStackTrace();
				} catch (Exception e) {
					System.out.println("다시 확인해주세요.");
					e.printStackTrace();
				}
	}
		
	
	public void inquireBook() {
		
	}
	
	public void inquireOverdue() {
		
	}
	
}
