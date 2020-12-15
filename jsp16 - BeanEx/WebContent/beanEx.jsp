<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.study.jsp.Student" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name="student" property="name" value="홍길동"/>
	<jsp:setProperty name="student" property="age" value="12"/>
	<jsp:setProperty name="student" property="grade" value="6"/>
	<jsp:setProperty name="student" property="studentNum" value="8"/>
	
	이름 : <jsp:getProperty property="name" name="student"/><br>
	나이 : <jsp:getProperty property="age" name="student"/><br>
	학년 : <jsp:getProperty property="grade" name="student"/><br>
	번호 : <jsp:getProperty property="studentNum" name="student"/><br>
</body>
</html>