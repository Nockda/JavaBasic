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
	String max = request.getParameter("max");
	if(max!=null){
		try{
			int maxValue = Integer.parseInt(max);
			
			for(int i=0; i<maxValue;i++){
				out.println(i+"<br>");
			}
		} catch(NumberFormatException ne){
			out.println("<h1>'max' value should be number</h1>");
		}
	} else{
		out.println("<h1> you mush set 'max' parameter!!</h1>");
	}
	// 그냥 실행 하면 오류. 주소에 ?max=5라고 써야됨
%>
</body>
</html>