package com.study.jsp.command;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.member.MemberDao;
import com.study.member.MemberDTO;

public class BMemberCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mId = request.getParameter("id");
		String mPw = request.getParameter("pw");
		String mName = request.getParameter("name");
		String mEmail = request.getParameter("eMail");
		String mRDate = request.getParameter("rDate");
		String mAddress = request.getParameter("address");
		MemberDao dao = new MemberDao();
		ArrayList<MemberDTO> dto = dao.inquireMem();
		
		request.setAttribute("member_view", dto);
	}
}
