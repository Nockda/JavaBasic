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
<style>

</style>

<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
    <a class="navbar-brand" href="#">JSP 게시판 사이트</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="list.jsp">자유게시판</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            회원정보
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="Login.jsp">로그인</a></li>
            <li><a class="dropdown-item" href="modify.jsp">회원 정보 수정</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="logout.jsp">로그아웃</a></li>
          </ul>
        <li class="nav-item">
          <a class="nav-link" href="mgrMain.jsp">관리자화면</a>
        </li>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
    </div>
</nav>

<table width="500" cellpadding="5" cellspacing="5" border="1">
	<form action="write.do" method = "post">
		<tr>
			<td>이름</td>
			<td><input type="text" name="bName" size="50" style="width:20%"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="bTitle" size="50" style="width:100%"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="bContent" rows="20" style="width:100%;"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="입력">&nbsp;&nbsp;
				<a href="list.do">목록보기</a>
			</td>
		</tr>
	</form>
</table>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>