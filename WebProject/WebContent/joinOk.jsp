<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Timestamp"%>
<%@ page import="com.study.member.*"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="com.study.member.MemberDTO" />
<jsp:setProperty name="dto" property="*" />

<%
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
MemberDao dao = MemberDao.getInstance();
if (dao.confirmId(dto.getId()) == MemberDao.MEMBER_EXISTENT) {
%>
<script language="javascript">
	alert("아이디가 이미 존재합니다.");
	history.back();
</script>
<%
	} else {
	int ri = dao.insertMember(dto);
	if (ri == MemberDao.MEMBER_JOIN_SUCCESS) {
	session.setAttribute("id", dto.getId());
%>
<script language="javascript">
	alert("회원가입을 축하합니다.");
	document.location.href = "Login.jsp";
</script>
<%
	} else {
%>
<script language="javascript">
	alert("회원가입을 실패했습니다.ㅜㅜ");
	document.location.href = "join.jsp";
</script>
<%
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>