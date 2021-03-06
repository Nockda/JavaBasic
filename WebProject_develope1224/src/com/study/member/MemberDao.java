package com.study.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.study.jsp.dto.BDto;

public class MemberDao{
	
    public static final int MEMBER_NONEXISTENT =0;
    public static final int MEMBER_EXISTENT =1;
    public static final int MEMBER_JOIN_FAIL =0;
    public static final int MEMBER_JOIN_SUCCESS =1;
    public static final int MEMBER_LOGIN_PW_NO_GOOD =0;
    public static final int MEMBER_LOGIN_PW_SUCCESS =1;
    public static final int MEMBER_LOGIN_PW_IS_NOT =-1;

    public static MemberDao instance = new MemberDao();
    
    public MemberDao() {
    }
    
    public static MemberDao getInstance() {
    	return instance;
    }

	public int insertMember(MemberDTO dto) {
		int ri=0;
		
		Connection con =null;
		PreparedStatement pstmt = null;
		String query = "insert into members values (?, ?, ?, ?, ?, ?, null)";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.geteMail());
			pstmt.setTimestamp(5, dto.getrDate());
			pstmt.setString(6, dto.getAddress());
			pstmt.executeUpdate();
			ri=MemberDao.MEMBER_JOIN_SUCCESS;
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}
	
	public int countId(String id) {
		int ri=0;
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select count(id) from members";
		
		try {
			con = getConnection();
			pstmt=con.prepareStatement(query);
			set=pstmt.executeQuery();
			ri = set.getInt(ri);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				con.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}
	
	public int confirmId(String id) {
		int ri=0;
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select id from members where id=?";
		
		try {
			con = getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			set=pstmt.executeQuery();
			if(set.next()) {
				ri=MemberDao.MEMBER_EXISTENT;
			} else {
				ri=MemberDao.MEMBER_NONEXISTENT;
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				con.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	
		return ri;
	}
	
	
	public int userCheck(String id, String pw) {
		int ri=0;
		String dbPw;
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select pw from members where id = ?";
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			set=pstmt.executeQuery();
			
			if(set.next()) {
				dbPw=set.getString("pw");
				if(dbPw.equals(pw)) {
					System.out.println("login ok");
					ri=MemberDao.MEMBER_JOIN_SUCCESS;	//로그인 ok
				} else {
					System.out.println("login fail");
					ri=MemberDao.MEMBER_LOGIN_PW_NO_GOOD;	//비밀번호 x
				}
			} else {
				System.out.println("login fail - false id");
				ri=MemberDao.MEMBER_LOGIN_PW_IS_NOT;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				con.close();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}
	
	public MemberDTO getMember(String id) {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select * from members where id =?";
		MemberDTO dto = null;
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			set=pstmt.executeQuery();
		    
			if(set.next()) {
				dto = new MemberDTO();
				dto.setId(set.getString("id"));
				dto.setPw(set.getString("pw"));
				dto.setName(set.getString("name"));
				dto.seteMail(set.getString("eMail"));
				dto.setrDate(set.getTimestamp("rDate"));
				dto.setAddress(set.getString("address"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				set.close();
				pstmt.close();
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public int updateMember(MemberDTO dto) {
		int ri = 0;
		Connection con =null;
		PreparedStatement pstmt = null;
		String query="update members set pw=?, eMail=?, address=? where id=?";
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.geteMail());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getId());
			ri=pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}
	
	public int deleteMember(MemberDTO dto) {
		int ri = 0;
		Connection con =null;
		PreparedStatement pstmt = null;
		String query="delete from members where id = ?";
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, dto.getId());
			ri=pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}

	
	public ArrayList<MemberDTO> searchMem(String id) {
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select * from members where id =?";
		MemberDTO dto = null;
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			set = pstmt.executeQuery();
			
			if (set.next()) {
				String mId = set.getString("id");
				String mPw = set.getString("pw");
				String mName = set.getString("name");
				String mEmail = set.getString("eMail");
				Timestamp mRdate = set.getTimestamp("rDate");
				String mAddress = set.getString("address");

				dto = new MemberDTO(mId, mPw, mName, mEmail, mRdate, mAddress);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (set != null)
					set.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}

	public ArrayList<MemberDTO> inquireMem() {
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet set = null;
		String query="select * from members";
		MemberDTO dto = null;
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			set = pstmt.executeQuery();

			while (set.next()) {
				String mId = set.getString("id");
				String mPw = set.getString("pw");
				String mName = set.getString("name");
				String mEmail = set.getString("eMail");
				Timestamp mRdate = set.getTimestamp("rDate");
				String mAddress = set.getString("address");

				dto = new MemberDTO(mId, mPw, mName, mEmail, mRdate, mAddress);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (set != null)
					set.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}
	
	public int updateMgr(String id) {
		int ri = 0;
		Connection con =null;
		PreparedStatement pstmt = null;
		String query="insert mgrmembers values (?)";
		MemberDTO dto;
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.geteMail());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getId());
			ri=pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return ri;
	}

	private Connection getConnection() {
		
		Context context = null;
		DataSource dataSource = null;
		Connection con = null;
		try {
			// lookup 함수의 파라메터는 context.xml에 설정된
			// name(jdbc/Oracle11g)과 동일해야 된다.
			context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con = dataSource.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
