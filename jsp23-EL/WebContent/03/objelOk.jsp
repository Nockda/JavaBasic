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
String id=request.getParameter("id");
String pw=request.getParameter("pw");
%>
아이디 : <%= id %><br>
비밀번호 : <%= pw %>
<hr>
아이디 : ${param.id }<br>
비번 : ${param.pw }<br>
아이디 : ${param["id"] }<br>
비밀번호 : ${param["pw"] }<br>
<hr>
application.setAttribute("application_name","application_value");
session.setAttribute("session_name", "session_value");
request.setAttribute("request_name", "request_value");
pageContext.setAttribute("page_name", "page_value");
<hr>
context 초기화 파라미터<br>
${ initParam.con_name }<br>
${ initParam.con_id }<br>
${ initParam.con_pw }<br>

</body>
</html>