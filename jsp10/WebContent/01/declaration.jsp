<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	//변수선언시 <%!
	int i = 10;
	String str = "ABCDE";
%>
<%!
	//메서드 선언시 <%!
	private int sum(int a , int b){
	return a+b;
}
%>

<%
	out.println("i = " + i + "<br>");
	out.println("str + " + str + "<br>");
	out.println("sum + " + sum(1,5) + "<br>");
%>


</body>
</html>