package com.study.jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/modifyOk")
public class modifyOk implements Service {
    public modifyOk() {
    }
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id=(String)session.getAttribute("id");
		MemberDto dto = new MemberDto();
		dto.setId(id);
		MemberDao dao = MemberDao.getInstance();
		int ri = dao.updateMember(dto);
		if(ri==1){
			response.sendRedirect("main.jsp");
		}else{
			System.out.println("정보수정에 실패했습니다.");
		}
	}
}

