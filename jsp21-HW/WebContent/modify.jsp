<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.study.member.*"%>
<%
	String id = (String) session.getAttribute("id");
MemberDao dao = MemberDao.getInstance();
MemberDTO dto = dao.getMember(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modifyOk.jsp" method="post" name="reg_frm">
		아이디 :
		<%=dto.getId()%><br> 비밀번호 : <input type="password" name="pw"
			size="20"><br> 비밀번호 확인: <input type="password"
			name="pw_check" size="20"><br> 이름 :
		<%=dto.getName()%><br> 메일 : <input type="text" name="eMail"
			size="20" value="<%=dto.geteMail()%>"><br> 주소 : <input
			type="text" name="address" size="50" value="<%=dto.getAddress()%>"><br>
		<p>
			<input type="button" value="수정" onclick="updateInfoConfirm()">
			<input type="reset" value="취소"
				onclick="javascript:window.location='main.jsp'">
	</form>
</body>
</html>