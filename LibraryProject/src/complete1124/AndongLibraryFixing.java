package complete1124;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class AndongLibraryFixing {

	Connection con;
	PreparedStatement pstmt1;
	PreparedStatement pstmt2;
	PreparedStatement pstmt3;
	PreparedStatement pstmt4;
	PreparedStatement pstmt5;
	Scanner sc = new Scanner(System.in);
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		AndongLibraryFixing mpb = new AndongLibraryFixing();
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
				showMenu5();
				subMenu4();
				break;
			case 5:
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
		case 6:
			searchBook();
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
		case 6:
			black();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void subMenu4() {				//지표관련서브메뉴
		int choice;
		choice = sc.nextInt();
		String less = sc.nextLine();
		switch(choice) {
		case 1:
			return;
		case 2:
			newBook();
			break;
		case 3:
			bestSeller();
			break;
		case 4:
			mostReader();
			break;
		case 5:
			rentalDays();
			break;
		case 6:
			countBook();
			break;
		case 7:
			bookYear();
			break;
		case 8:
			bookPrice();
			break;
		case 9:
			bookYearPrice();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void showMenu1() {
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"
				+ "┃안동 스마트 도서관에 오신 것을 환영합니다.┃\n"
				+ "┃   Andong Smart Library - Librarian Mode  ┃\n"
				+ "┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n"
				+ "┃		[메뉴선택]		   ┃\n"
				+ "┃		1.회원 정보		   ┃\n"
				+ "┃		2.도서 관련	   	   ┃\n"
				+ "┃		3.대출 관련		   ┃\n"
				+ "┃		4.지표 통계 조회	   ┃\n"
				+ "┃		5.종료			   ┃\n"
				+ "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n"
				+ "				     v.1.01\n"
				+ "선택 : ");
	}
	
	public void showMenu2() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺"
				+ "\n[회원정보]\n\n"
				+ "1. << 뒤로가기\n\n"
				+ "2. 신규회원가입\n\n"
				+ "3. 회원정보조회\n\n"
				+ "4. 회원탈퇴\n\n\n"
				+ "선택 : \n\n\n");
	}
	
	public void showMenu3() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n====================================================="
				+ "\n[도서관련]\n\n"
				+ "1. << 뒤로가기\n\n"
				+ "2. 신규도서등록\n\n"
				+ "3. 도서조회\n\n"
				+ "4. 배가상태변경\n\n"
				+ "5. 도서폐기\n\n"
				+ "6. 제목으로 검색\n\n"
				+ "선택 : \n\n\n");
	}
	
	public void showMenu4() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n====================================================="
				+ "\n[대출관련]\n\n"
				+ "1. << 뒤로가기\n\n"
				+ "2. 도서대출\n\n"
				+ "3. 도서반납\n\n"
				+ "4. 도서조회\n\n"
				+ "5. 책 연체조회\n\n"
				+ "6. 사용자 연체조회\n\n"
				+ "선택 : \n\n\n");
	}
	
	public void showMenu5() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓"
				+ "\n[통계관련]\n"
				+ "1.<< 뒤로가기\n"
				+ "2.이번달 신작 리스트\n"
				+ "3.베스트 셀러 순위\n"
				+ "4.이달의 독서왕\n"
				+ "5. 전체 이용자 평균대여기간\n"
				+ "6. 월별 도서 입고 추이\n"
				+ "7. 발행 년도별 도서수\n"
				+ "8. 도서 평균 가격\n"
				+ "9. 연도별 도서평균 가격\n"
				+ "선택 : \n\n\n");
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
		System.out.print("발행자 : ");
		String issueCom = sc.nextLine();
		System.out.print("발행년 : ");
		String issueYear = sc.nextLine();
		System.out.print("가격 : ");
		String bookPrice = sc.nextLine();
		System.out.print("입고날짜 : ");
		String arraivalDate = sc.nextLine();
		
		String sql = "insert into BookList values(?, ?, ?, ?, ?, ?, ?, ?, BOOK_SEQ.nextval)";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, bookId);
			pstmt1.setString(2, location);
			pstmt1.setString(3, bookName);
			pstmt1.setString(4, author);
			pstmt1.setString(5, issueCom);
			pstmt1.setString(6, issueYear);
			pstmt1.setString(7, bookPrice);
			pstmt1.setString(8, arraivalDate);
			pstmt1.executeUpdate();
			System.out.println("데이터베이스에 " + bookName + "의 데이터가 추가되었습니다.");
		} catch (Exception e) {
			System.out.println("입력 에러입니다.");
			e.printStackTrace();
		}
	}
	
	public void changeBookStatus() {
		
		System.out.println("등록번호 : ");
		String bookId = sc.nextLine();
		System.out.println("상태값 종류 :\n"
				+ "1. 관외대출자료\n"
				+ "2. 분실자료\n"
				+ "3. 비치자료\n"
				+ "4. 재정리자료\n");
		System.out.println("배가상태 : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			String status = "관외대출자료";
			String sql = "update booklist set 배가상태 = ? where 등록번호 = ?";
			
			try {
				pstmt1 = con.prepareStatement(sql);
				pstmt1.setString(1, status);
				pstmt1.setString(2, bookId);
				pstmt1.executeUpdate();
				System.out.println("데이터베이스에 " + bookId + "의 데이터가 수정되었습니다.");
			} catch (Exception e) {
				System.out.println("입력 에러입니다.");
				e.printStackTrace();
			}
		} else if(choice == 2) {
			String status = "분실자료";
			String sql = "update booklist set 배가상태 = ? where 등록번호 = ?";
			
			try {
				pstmt1 = con.prepareStatement(sql);
				pstmt1.setString(1, status);
				pstmt1.setString(2, bookId);
				pstmt1.executeUpdate();
				System.out.println("데이터베이스에 " + bookId + "의 데이터가 수정되었습니다.");
			} catch (Exception e) {
				System.out.println("입력 에러입니다.");
				e.printStackTrace();
			}
		} else if(choice == 3) {
			String status = "비치자료";
			String sql = "update booklist set 배가상태 = ? where 등록번호 = ?";
			
			try {
				pstmt1 = con.prepareStatement(sql);
				pstmt1.setString(1, status);
				pstmt1.setString(2, bookId);
				pstmt1.executeUpdate();
				System.out.println("데이터베이스에 " + bookId + "의 데이터가 수정되었습니다.");
			} catch (Exception e) {
				System.out.println("입력 에러입니다.");
				e.printStackTrace();
			}
		} else if(choice == 4) {
			String status = "재정리자료";
			String sql = "update booklist set 배가상태 = ? where 등록번호 = ?";
			
			try {
				pstmt1 = con.prepareStatement(sql);
				pstmt1.setString(1, status);
				pstmt1.setString(2, bookId);
				pstmt1.executeUpdate();
				System.out.println("데이터베이스에 " + bookId + "의 데이터가 수정되었습니다.");
			} catch (Exception e) {
				System.out.println("입력 에러입니다.");
				e.printStackTrace();
			}
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
		
		
		
			String sql = "select count(*) from Status where 대여자아이디 = ?";
			try {
				pstmt2 = con.prepareStatement(sql);
				pstmt2.setString(1, id);
				ResultSet rs = pstmt2.executeQuery();
				if(rs.next()) {
					int count = rs.getInt(1);
				if(count<2) {
						sql = "insert into Status values(B_SEQ.nextval, ?, ?, sysdate, ?, ?)";
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
				} else {
					System.out.println("****대여 가능 권수를 벗어났습니다.****");
				}
				}
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("알수없는 에러가 났습니다.");
			}
		}

	
	public void returnBook() {	
		System.out.print("도서등록번호 : ");
		String bookId = sc.nextLine();
		
		try {
			String check = "update status set 반납날짜 = to_date(sysdate, 'yyyy-mm-dd') where 도서등록번호 = ?";
			pstmt4 = con.prepareStatement(check);
			pstmt4.setString(1, bookId);
			pstmt4.executeUpdate();
			String check2 = "update status set 대여기간 = to_number(to_date(반납날짜, 'YYYY-MM-DD') - to_date(대여날짜, 'YYYY-MM-DD')) where 도서등록번호 = "+ "'"+ bookId + "'";
			pstmt5 = con.prepareStatement(check2);
			pstmt5.executeUpdate();
				
			System.out.println(bookId + "의 반납이 완료되었습니다.");
		} catch (InputMismatchException er) {
			System.out.println("반납 목록에 없습니다. 다시 확인해주세요.");
			er.printStackTrace();
		} catch (Exception e) {
			System.out.println("입력 오류입니다. 다시 확인해주세요.");
		}
	}
		
	
	public void inquireBook() {
		System.out.print("\n조회 할 책의 등록번호 : ");
		String bId = sc.nextLine();
		
		String sql = "select * from bookList where 등록번호 = ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, bId);
			ResultSet rs = pstmt2.executeQuery();
			System.out.println("==================================================");
			if(rs.next()) {
				System.out.println("조회하신 [" + rs.getString(3) + "]의 정보는 아래와 같습니다.\n");
				System.out.println("등록번호 : " + rs.getString(1));
				System.out.println("배가상태 : " + rs.getString(2));
				System.out.println("도서명 : " + rs.getString(3));
				System.out.println("저작자 : " + rs.getString(4));
				System.out.println("발행자 : " + rs.getString(5));
				System.out.println("발행년 : " + rs.getString(6));
				System.out.println("가격 : " + rs.getString(7));
				System.out.println("입고날짜 : " + rs.getString(8));
				System.out.println("입고순서 : " + rs.getString(9));
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
	
	public void inquireOverdue() {
		System.out.print("\n연체조회 할 책의 등록번호 : ");
		String bId = sc.nextLine();
		
		String sql = "select * from Status where 도서등록번호 = ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, bId);
			ResultSet rs = pstmt2.executeQuery();
			System.out.println("==================================================");
			if(rs.next()) {
				System.out.println("조회하신 책의 대여기간은 " + rs.getString(6) + "일 입니다.\n각 권당 대여가능일수는 7일 입니다.");
				System.out.println("대출순서 : " + rs.getString(1));
				System.out.println("도서등록번호 : " + rs.getString(2));
				System.out.println("대여자ID : " + rs.getString(3));
				System.out.println("대여날짜 : " + rs.getString(4));
				System.out.println("반납날짜 : " + rs.getString(5));
				System.out.println("대여기간 : " + rs.getString(6));
				System.out.println();
			}else {
				System.out.println("조회하신 데이터가 없습니다.");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
	}

	
	public void searchBook() {
		System.out.print("\n조회 할 키워드 : ");
		String name = sc.nextLine();
		
		String sql = "select * from booklist where 도서명 like ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, '%'+name+'%');
			ResultSet rs = pstmt2.executeQuery();
			System.out.println("==================================================");
			if(rs.next()) {
				System.out.println("조회하신 [" + rs.getString(3) + "]의 정보는 아래와 같습니다.\n");
				System.out.println("등록번호 : " + rs.getString(1));
				System.out.println("배가상태 : " + rs.getString(2));
				System.out.println("도서명 : " + rs.getString(3));
				System.out.println("저작자 : " + rs.getString(4));
				System.out.println("발행자 : " + rs.getString(5));
				System.out.println("발행년 : " + rs.getString(6));
				System.out.println("가격 : " + rs.getString(7));
				System.out.println("입고날짜 : " + rs.getString(8));
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
	
	public void black () {
		boolean black2;
		System.out.print("\n조회 할 아이디 : ");
		String clientId = sc.nextLine();
		Date date = new Date();
		
		String sql = "select 반납날짜 + (대여기간-7) from status where 대여자아이디 = ?";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, clientId);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				Date checkdate = rs.getTimestamp(1);
				System.out.println(checkdate);
//				if(checkdate - date) {
//					black = true;
//				} else {
//					black = false;
//				}
			}else {
				System.out.println("조회하신 이름의 데이터가 없습니다.");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
	
	}
	
	public void newBook() {
		
		try {
			Statement stmt = con.createStatement();
			Date date = new Date();
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM");
			String time1 = format1.format(date);
			
			StringBuffer sb2 = new StringBuffer();
			sb2.append("select count(도서명) from booklist where to_char(입고날짜,'yyyy/MM') = '"+time1+"'");
			ResultSet rs2 = stmt.executeQuery(sb2.toString());
			int num = 0;
			
			if(rs2.next()) {
				num = rs2.getInt(1);
			}
			
			System.out.println("[ 이번달에 새로 입고 된 신작 ]");
			StringBuffer sb = new StringBuffer();
			sb.append("select 도서명 from booklist where to_char(입고날짜,'yyyy/MM') = '"+time1+"'");
			ResultSet rs = stmt.executeQuery(sb.toString());
			
//			if(rs.next()) {
//				System.out.println(rs.getString(1));
//			}else {
//				System.out.println("이번달 신작이 없습니다.");
//			}
			
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
			 
			while(rs.next()) {
				HashMap<String,Object> row = new HashMap<String, Object>(columns);
				for(int i=1; i<=columns; ++i) {
					row.put(md.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			
			rs.close();
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("알수없는 에러가 났습니다.");
		}
	}

	public void bestSeller() {
		
		try{
		Statement stmt = con.createStatement();

		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM");
		String time1 = format1.format(date);

		System.out.println("[ 이번달 베스트 셀러 ]");
		StringBuffer sb = new StringBuffer();
		
		sb.append("select a.도서등록번호, b.도서명 from( select 도서등록번호, count(도서등록번호) from status where to_char(대여날짜,'yyyy/MM') = '" + time1 + "' group by 도서등록번호 order by count(도서등록번호) desc) a, booklist b where rownum <10 and a.도서등록번호 = b.등록번호");
		ResultSet rs = stmt.executeQuery(sb.toString());
		
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		 
		while(rs.next()) {
			HashMap<String,Object> row = new HashMap<String, Object>(columns);
			for(int i=1; i<=columns; ++i) {
				row.put(md.getColumnName(i), rs.getObject(i));
				System.out.println(i + "위 : " + rs.getObject(i));
			}
			list.add(row);
		}
		
		rs.close();
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("알수없는 에러가 났습니다.");
		}
	}
	
	public void mostReader() {
		
	}
	
	public void rentalDays() {
		
	}
	
	public void countBook() {
		
	}
	
	public void bookYear() {
		
	}

	public void bookPrice() {
		
	}
	
	public void bookYearPrice() {
		
	}

}
