package complete1125;
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
import java.util.Scanner;


public class complete1125_2 {

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
		complete1125_2 mpb = new complete1125_2();
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
			monthInput();
			break;
		case 7:
			bookYear();
			break;
		case 8:
			bookPrice();
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}
	}
	
	public void showMenu1() {				// 메인 메뉴
		
		String sql = "commit";
		
		try {
			pstmt1 = con.prepareStatement(sql);
			pstmt1.executeUpdate();
		} catch (Exception e) {
			System.out.println("커밋 에러입니다.");
			e.printStackTrace();
		}
		
		System.out.println("\n\n\t┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n"
				+ "\t┃안동 스마트 도서관에 오신 것을 환영합니다.┃\n"
				+ "\t┃   Andong Smart Library - Librarian Mode  ┃\n"
				+ "\t┠━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n"
				+ "\t┃		[메뉴선택]		   ┃\n"
				+ "\t┃		1.회원 정보		   ┃\n"
				+ "\t┃		2.도서 관련	   	   ┃\n"
				+ "\t┃		3.대출 관련		   ┃\n"
				+ "\t┃		4.지표 통계 조회	   ┃\n"
				+ "\t┃		5.종료			   ┃\n"
				+ "\t┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n"
				+ "\t				     v.1.01\n"
				+ "\t선택 : \n\n");
	}
	
	public void showMenu2() {				// 회원정보 메뉴
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t============================"
				+ "\n\t\t=========[회원정보]=========\n\t\t============================\n\n"
				+ "\t\t     1. << 뒤로가기\n\n"
				+ "\t\t     2. 신규회원가입\n\n"
				+ "\t\t     3. 회원정보조회\n\n"
				+ "\t\t     4. 회원탈퇴\n\n\t\t============================\n\n"
				+ "\t\t     선택 : \n\n");
	}
	
	public void showMenu3() {				// 도서관련 메뉴
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t============================"
				+ "\n\t\t=========[도서관련]=========\n\t\t============================\n\n"
				+ "\t\t     1. << 뒤로가기\n\n"
				+ "\t\t     2. 신규도서등록\n\n"
				+ "\t\t     3. 등록번호로 도서조회\n\n"
				+ "\t\t     4. 배가상태변경\n\n"
				+ "\t\t     5. 도서폐기\n\n"
				+ "\t\t     6. 제목으로 검색\n\n\t\t============================\n\n"
				+ "\t\t     선택 : \n\n\n");
	}
	
	public void showMenu4() {				// 대출관련 메뉴
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t============================"
				+ "\n\t\t=========[대출관련]=========\n\t\t============================\n\n"
				+ "\t\t     1. << 뒤로가기\n\n"
				+ "\t\t     2. 도서대출\n\n"
				+ "\t\t     3. 도서반납\n\n"
				+ "\t\t     4. 도서조회\n\n"
				+ "\t\t     5. 책 연체조회\n\n"
				+ "\t\t     6. 사용자 연체조회\n\n\t\t============================\n\n"
				+ "\t\t     선택 : \n\n\n");
	}
	
	public void showMenu5() {				// 지표관련 메뉴
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t============================"
				+ "\n\t\t=========[지표조회]=========\n\t\t============================\n\n"
				+ "\t\t 1. << 뒤로가기\n"
				+ "\t\t 2. 이번달 신작 리스트\n"
				+ "\t\t 3. 베스트 셀러 순위\n"
				+ "\t\t 4. 이달의 독서왕\n"
				+ "\t\t 5. 전체 이용자 평균대여기간\n"
				+ "\t\t 6. 월별 도서 입고 추이\n"
				+ "\t\t 7. 발행 년도별 도서수\n"
				+ "\t\t 8. 도서 평균 가격 가격\n\n\t\t============================\n"
				+ "\t\t 선택 : \n\n\n");
	}
	
	public void addClient() {				// 회원가입
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
		String sql2 = "select concat('SM', LPAD(bookNo_seq.nextval, 10, 0))from dual";
		try {
			pstmt2 = con.prepareStatement(sql2);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				String bookNo = rs.getString(1);
				String bookId = bookNo;

				System.out.print("배가상태 : \n"
						+ "배가상태 종류 = '관외대출자료', '분실자료', '비치자료', '재정리자료'");
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
				System.out.print("입고날짜(YYYY.MM.DD) : ");
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
			rs.close();
		} catch (Exception e) {
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
	
	public boolean checkB (String id) {
		boolean checkBlack = false;

		String cId = id;
		Date date1 = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		String date = format1.format(date1);
		
		String sql = "select * from (select 반납날짜 + (대여기간-7) as 기간 from status where 대여자아이디 = ? and 대여기간 is not null) order by 기간 desc";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, cId);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getDate(1));
				String blackDate = format1.format(rs.getDate(1));
				Date today = format1.parse(date);
				Date Bday = format1.parse(blackDate);
				if(today.after(Bday)) {
					checkBlack = true;
				} else
					checkBlack = false;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
		return checkBlack;
	}
	
	
	
	public void borrowBook() {
		System.out.print("도서등록번호 : ");
		String bookId = sc.nextLine();
		System.out.print("대여자 ID : ");
		String id = sc.nextLine();
		
		boolean checkBook = checkborrow(bookId);		// 책이 있는지 확인
		
		if(checkBook == true) {
			boolean check = checkB(id);					// 대여자 블랙리스트 확인
			if(check == true) {
				String sql = "select count(*) from Status where 대여자아이디 = ? and 반납날짜 is null";
				try {
					pstmt2 = con.prepareStatement(sql);
					pstmt2.setString(1, id);
					ResultSet rs = pstmt2.executeQuery();
					if(rs.next()) {
						int countb = rs.getInt(1);
						if(countb<3) {
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
			} else
				System.out.println("대여 금지 기간입니다.");
		}else
			System.out.println("책이 이미 대여중입니다.");
	}
	
	public boolean checkborrow (String bookId) {
		boolean checkBook = false;

		String bId = bookId;
		
		String sql = "select count(*) from Status where 도서등록번호 = ? and 반납날짜 is null";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, bId);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1) > 0) {
					checkBook = false;
				} else
					checkBook = true;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("대여 확인 중에 알수없는 에러가 났습니다.");
		}
		return checkBook;
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
		System.out.print("\n조회 할 아이디 : ");
		String clientId = sc.nextLine();
		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		
		
		String sql = "select * from (select 반납날짜 + (대여기간-7) as 기간 from status where 대여자아이디 = ? and 대여기간 is not null) order by 기간 desc";
		try {
			pstmt2 = con.prepareStatement(sql);
			pstmt2.setString(1, clientId);
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				String checkdate = rs.getString(1);
				System.out.println(checkdate);
					
				System.out.println("조회하신 " + clientId + "님의 대출 제한 기간은 "+checkdate +"까지 입니다.");

			} else {
				System.out.println("블랙리스트 날짜 체크 중에 오류가 났습니다.");
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
			
			System.out.println("[ 이번달에 새로 입고 된 신작 ]\n");
			StringBuffer sb = new StringBuffer();
			sb.append("select 도서명 from booklist where to_char(입고날짜,'yyyy/MM') = '"+time1+"'");
			ResultSet rs = stmt.executeQuery(sb.toString());
			
			ResultSetMetaData md = rs.getMetaData();
			int columns = md.getColumnCount();
			ArrayList<String> list = new ArrayList<>();
			 
			while(rs.next()) {
				for(int i=1; i<=columns; ++i) {
					list.clear();
					list.add(rs.getObject(i).toString());
				}
				for(String k : list) {
					System.out.println(k);
				}
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

		System.out.println("[ "+time1+"  - 이번달 베스트 셀러 ]\n");
		StringBuffer sb = new StringBuffer();
		
		sb.append("select a.도서등록번호, b.도서명 from( select 도서등록번호, count(도서등록번호) from status where to_char(대여날짜,'yyyy/MM') = '" + time1 + "' group by 도서등록번호 order by count(도서등록번호) desc) a, booklist b where rownum <10 and a.도서등록번호 = b.등록번호");
		ResultSet rs = stmt.executeQuery(sb.toString());
		
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		ArrayList<String> list = new ArrayList<>();
		 
		while(rs.next()) {
			for(int i=1; i<=columns; ++i) {
				list.clear();
				list.add(rs.getObject(i).toString());
			}
			for(String k : list) {
				System.out.println(k);
			}

		}
		
		rs.close();
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("알수없는 에러가 났습니다.");
		}
	}
	
	public void mostReader() {
		
		try{
		Statement stmt = con.createStatement();

		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM");
		String time1 = format1.format(date);

		System.out.println("[ "+time1+"  - 이번달 독서왕 Top 10 ]\n");
		StringBuffer sb = new StringBuffer();
		
		sb.append("select 이름 from( select 이름, count(대여자아이디) as 대여횟수 from(select * from list a join status b on a.ID = b.대여자아이디) where to_char(대여날짜,'yyyy/MM') = '" + time1 + "' group by 이름 order by 대여횟수 desc) where rownum <10");
		ResultSet rs = stmt.executeQuery(sb.toString());
		
		ResultSetMetaData md = rs.getMetaData();
		int columns = md.getColumnCount();
		ArrayList<String> list = new ArrayList<>();
		
		while(rs.next()) {
			for(int i=1; i<=columns; i++) {
				list.clear();
				list.add(rs.getObject(i).toString());
			}
			for(String k : list) {
				System.out.print(k);
			}

			System.out.println();
		}
		
		rs.close();
		}catch (Exception e) {
		e.printStackTrace();
		System.out.println("알수없는 에러가 났습니다.");
		}
	}
	
	public void rentalDays() {
		
	}
	
	public void monthInput() {
		
	}
	
	public void bookYear() {

		
		System.out.println("\n\n\n\t < 발행년별 보유 도서 수 >");
		try{
			
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist where 발행년 < 2021 and 발행년 > 2010");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\n\t 2010년대 도서보유권수(2010~2020) : " + rs.getString(1) + "권");
			}
			
			rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist where 발행년 < 2011 and 발행년 > 2000");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 2000년대 도서보유권수(2000~2010) : " + rs.getString(1) + "권");
			}
		rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			
			sb.append("select count(도서명) from booklist where 발행년 < 2001 and 발행년 >1990");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1990년대 도서보유권수(1990~2000) : " + rs.getString(1) + "권");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist where 발행년 < 1991 and 발행년 >1980");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1980년대 도서보유권수(1980~1990) : " + rs.getString(1) + "권");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist where 발행년 < 1981 and 발행년 >1970");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1970년대 도서보유권수(1970~1980) : " + rs.getString(1) + "권");
			}rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist where 발행년 < 1971");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1970년대 이전 도서보유권수(~1970) : " + rs.getString(1) + "권");
			}
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select count(도서명) from booklist");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 안동 스마트 도서관 전체 보유 권수 : " + rs.getString(1) + "권");
			}
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bookPrice() {

		
		System.out.println("\n\n\n\t < 시대별 도서 가격 변동 추이 >");
		try{
			
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 2021 and 발행년 > 2010");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\n\t 2010년대 도서가격(2010~2020) : " + rs.getString(1) + "원");
			}
			
			rs.close();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 2011 and 발행년 > 2000");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 2000년대 도서가격(2000~2010) : " + rs.getString(1) + "원");
			}
		rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}

		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 2001 and 발행년 >1990");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1990년대 도서가격(1990~2000) : " + rs.getString(1) + "원");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
			
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 1991 and 발행년 >1980");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1980년대 도서가격(1980~1990) : " + rs.getString(1) + "원");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
			
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 1981 and 발행년 >1970");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1970년대 도서가격(1970~1980) : " + rs.getString(1) + "원");
			}rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist where 발행년 < 1971");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 1970년대 이전 도서가격(~1970) : " + rs.getString(1) + "원");
			}
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
		
		try {
			Statement stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			
			sb.append("select round(avg(가격)) from booklist");
			ResultSet rs = stmt.executeQuery(sb.toString());
			while(rs.next()) {
				System.out.println("\t 전체 도서 평균가격 : " + rs.getString(1) + "원");
			}
			rs.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 났습니다.");
		}
	}

}
