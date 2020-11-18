import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");

			
			//--------------------------------------------------\
			System.out.println("부서번호 : ");
			String dno = sc.nextLine();
			System.out.println("급여 : ");
			String salary = sc.nextLine();
			String sql = "select eno, ename, salary, dno from employee where dno = " + dno + " and salary >= " + salary;
			pstmt2 = con.prepareStatement(sql);
			rs = pstmt2.executeQuery();
			System.out.println("사원번호\t이름\t\t급여\t\t부서번호");
			System.out.println("==========================================================");
			while(rs.next()) {
			System.out.print(rs.getString(1) + "\t\t");
			System.out.print(rs.getString(2) + "\t\t");
			System.out.print(rs.getString(3) + "\t\t");
			System.out.println(rs.getString(4));
			}

			
	} catch (SQLException sqle) {
		sqle.printStackTrace();
	} finally {
		try {
			if(rs!=null) rs.close();
			if(pstmt1!=null) pstmt1.close();
			if(con!=null) con.close();
		} catch(SQLException sqle) {}
		}	
	sc.close();
	}
}