package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.do")
public class FrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontCon() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("actionDo");

		String uri = request.getRequestURI();
		System.out.println("uri:" + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:" + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:" + command);

		if (command.equals("/loginOk.do")) {
			loginOk(request, response);
		} else if (command.equals("/modifyOk.do")) {
			modifyOk(request, response);
		} else if (command.equals("/joinOk.do")) {
			joinOk(request, response);
		} else if (command.equals("/logout.do")) {
			logoutOk(request, response);
		}
	}

	private void joinOk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("joinOk");

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String eMail = request.getParameter("eMail");
		String address = request.getParameter("address");

		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.seteMail(eMail);
		dto.setAddress(address);
		dto.setrDate(new Timestamp(System.currentTimeMillis()));

		response.setContentType("text/html; charset =UTF-8");
		PrintWriter writer = response.getWriter();

		MemberDao dao = MemberDao.getInstance();
		if (dao.confirmId(dto.getId()) == MemberDao.MEMBER_EXISTENT) {
			writer.println("<html><head></head><body>");
			writer.println("<script language = \"javascript\">");
			writer.println("   alert(\"아이디가 이미 존재 합니다. \");");
			writer.println("    history.back();");
			writer.println("</script>");
			writer.println("</body></html>");

		} else {
			int ri = dao.insertMember(dto);
			if (ri == MemberDao.MEMBER_JOIN_SUCCESS) {
				HttpSession session = request.getSession();
				session.setAttribute("id", dto.getId());

				writer.println("<html><head></head><body>");
				writer.println("<script language = \"javascript\">");
				writer.println("   alert(\" 회원가입 축하포카 \");");
				writer.println("    document.location.href=\"login.jsp\";");
				writer.println("</script>");
				writer.println("</body></html>");
				writer.close();

			} else {

				writer.println("<html><head></head><body>");
				writer.println("<script language = \"javascript\">");
				writer.println("   alert(\" 회원가입 실패 ㅠㅠ  \");");
				writer.println("    document.location.href=\"login.jsp\";");
				writer.println("</script>");
				writer.println("</body></html>");
				writer.close();
			}
		}

	}

	private void loginOk(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("joinOk");

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		

		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPw(pw);

		dto.setrDate(new Timestamp(System.currentTimeMillis()));

		response.setContentType("text/html; charset =UTF-8");
		PrintWriter writer = response.getWriter();
	

		MemberDao dao = MemberDao.getInstance();
		dto = dao.getMember(id);
		int checkNum = dao.userCheck(id, pw);
		if (checkNum == -1) {
			writer.println("<html><head></head><body>");
			writer.println("<script language = \"javascript\">");
			writer.println("   alert(\"아이디가 존재 하지 않습니다\");");
			writer.println("    document.location.href=\"login.jsp\";");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
		} else if (checkNum == 0) {
			writer.println("<html><head></head><body>");
			writer.println("<script language = \"javascript\">");
			writer.println("   alert(\"비밀번호가 틀립니다.\");");
			writer.println("    document.location.href=\"login.jsp\";");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
		} else if (checkNum == 1) {
			HttpSession session = request.getSession();
			
			String name = (String)dto.getName();
			request.setCharacterEncoding("UTF-8");
			System.out.println("1:"+name+"]");
			session.setAttribute("id",id);
			session.setAttribute("name",name);
			session.setAttribute("ValidMem","yes");
			response.sendRedirect("main.jsp");
			
			writer.close();
		}
	}

	private void modifyOk(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id=(String)session.getAttribute("id");
		MemberDto dto = new MemberDto();
		dto.setId(id);
		String pw = request.getParameter("pw");
		dto.setPw(pw);
		String eMail = request.getParameter("eMail");
		dto.seteMail(eMail);
		String address = request.getParameter("address");
		dto.setAddress(address);
		MemberDao dao = MemberDao.getInstance();
		
		int ri = dao.updateMember(dto);
		System.out.println(ri);
		if(ri==1){
			response.sendRedirect("main.jsp");
		}else{
			System.out.println("정보수정에 실패했습니다.");
		}
	}

	private void logoutOk(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("login.jsp");
	}
}