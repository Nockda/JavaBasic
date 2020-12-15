<%@ page import = "com.study.dto.MemberDTO" %>
<%@ page import = "com.study.dto.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO dto = new MemberDTO();

		dto.setId("abc");
		dto.setPw("123");
		dto.setName("홍길동");
		dto.setPhone("010-1234-2345");
		dto.setGender("male");
		int nResult = memberDAO.memberInsert(dto);

		dto.setId("def");
		dto.setPw("456");
		dto.setName("전우치");
		dto.setPhone("010-9839-9848");
		dto.setGender("male");
		nResult = memberDAO.memberInsert(dto);

		dto.setId("ghi");
		dto.setPw("789");
		dto.setName("손오순");
		dto.setPhone("010-2415-1234");
		dto.setGender("female");
		nResult = memberDAO.memberInsert(dto);

		out.println("insert success");

	} catch (Exception e) {
	}
	%>
	<br>
	<a href="memberSelect.jsp">회원정보보기</a>
</body>
</html>