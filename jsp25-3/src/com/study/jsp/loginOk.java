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

@WebServlet("/loginOk")
public class loginOk implements Service {

    public loginOk() {
    }

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
			response.sendRedirect("login.jsp");
		} else if (checkNum == 0) {
			writer.println("<html><head></head><body>");
			writer.println("<script language = \"javascript\">");
			writer.println("   alert(\"비밀번호가 틀립니다.\");");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
			response.sendRedirect("login.jsp");
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

}
