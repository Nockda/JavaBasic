<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.study.member.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String id = (String) session.getAttribute("id");
MemberDao dao = MemberDao.getInstance();
ArrayList<MemberDTO> dto = dao.searchMem(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
<style>
.container {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
	display : block; margin:0px auto;
}

.jumbotron {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
width : 400px;
display : block; margin:0px auto;
}

h1 {
	text-align: center;
}
</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
    <a class="navbar-brand" href="webmain.jsp">W.T.H</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="main.jsp">Welcome to the hell</a>
        </li>
        <!--  -->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell talk
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
         	<li><a class="dropdown-item" href="#">공지사항</a></li>
            <li><a class="dropdown-item" href="list.do">질문게시판</a></li>
          </ul>
        <li class="nav-item">
        <!--  -->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell's Member Desk
        </a>
        <!--  -->
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
         	<li><a class="dropdown-item" href="join.jsp">Registration</a></li>
         	<li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="Login.jsp">Login</a></li>
            <li><a class="dropdown-item" href="modify.jsp">Modify</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="logout.jsp">Logout</a></li>
        </ul>
        </li>
        <!--  -->
        <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell Manager
        </a>
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
         	<li><a class="dropdown-item" href="mgrAdd.jsp">관리자 등록</a></li>
         	<li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="mgrInquireMem.jsp">전체회원조회</a></li>
            <li><a class="dropdown-item" href="mgrSearchMem.jsp">회원검색</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="mgrStopLogin.jsp">회원로그인정지</a></li>
            <li><a class="dropdown-item" href="mgrBanMem.jsp">회원강제탈퇴</a></li>
            <li><a class="dropdown-item" href="mgrStat.jsp">회원정보그래프</a></li>
        </ul>
        </li>
        <!--  -->
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
    </div>
</nav>
<br>
<div class="jumbotron">
<div class="container">
<form method="post" action="searchMem.do">
	<h5 style="text-align: center; length:20px;">조회하실 회원 아이디를 넣어주세요</h5>
	<br>
	<div class="form-group">
	<input type="text" class="form-control" placeholder="아이디" name="id"
	maxlength="20" style="text-align: center; length:20px;">
	</div>
	<input type="submit" class="btn btn-primary form-control" value="검색">
<div class="container-fluid">
		<div class="row">
			<div class="col-sm">
				<hr>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">ID</th>
							<th scope="col">PW</th>
							<th scope="col">NAME</th>
							<th scope="col">EMAIL</th>
							<th scope="col">RDATE</th>
							<th scope="col">ADDRESS</th>
						</tr>
					</thead>
					
					<tbody>
					<c:forEach items="${searchMem}" var = "dto">
						<tr>
							<th scope="row">1</th>
							<td>${dto.mId}</td>
							<td>${dto.mPw}</td>
							<td>${dto.mName}</td>
							<td>${dto.mEmail}</td>
							<td>${dto.mRdate}</td>
							<td>${dto.mAddress}</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</form>
</div>
</div>
<br>
<hr>
<br>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>