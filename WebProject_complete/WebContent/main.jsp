<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("ValidMem") == null) {
%>
<jsp:forward page="Login.jsp" />
<%
	}
String name = (String) session.getAttribute("name");
String id = (String) session.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Insert title here</title>
<style>
p {
	text-align: center;
}

h2 {
	text-align: center;
	color:red;
}

h4 {
	text-align: center;
}

img {
	display: block;
	margin: 0px auto;
}

.navbar-brand {
	font-size: 35px;
}

@font-face {
	font-family: 'nd';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.3/NeoDunggeunmo.woff')
		format('woff');
	font-weight: normal;
	font-style: normal;
}

nav {
	font-family: nd
}

#contentdd {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
	margin-top: 20px;
	max-width: 400px;
	text-align:center;
}
#cont {
text-align:center;}
body{
font-family:nd
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="webmain.jsp">W.T.H</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="main.jsp"><Strong>Welcome
								to the hell</Strong></a></li>
					<!--  -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Hell talk </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="list.do">구원게시판</a></li>
						</ul>
					<li class="nav-item">
						<!--  -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Hell's Member </a> <!--  -->
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="join.jsp">지옥주민신청</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="Login.jsp">로그인</a></li>
							<li><a class="dropdown-item" href="modify.jsp">정보변경</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="logout.jsp">로그아웃</a></li>
						</ul></li>
					<!--  -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Hell Manager </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="mgrAdd.jsp">관리자 등록</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="mgrInquireMem.jsp">전체회원조회</a></li>
							<li><a class="dropdown-item" href="mgrSearchMem.jsp">회원검색</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="mgrStopLogin.jsp">회원로그인정지</a></li>
							<li><a class="dropdown-item" href="mgrBanMem.jsp">회원강제탈퇴</a></li>
							<li><a class="dropdown-item" href="mgrStat.jsp">회원정보그래프</a></li>
						</ul></li>
					<!--  -->
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>

		<div class="jumbotron" style="padding-top: 20px; ">
			<div class="container" id="cont">
				<img src="hellmanager.jpg" />
				<h2><%=name%>님 지옥에 어서오세요.
				</h2>
				<h4>저는 지옥 매니저입니다.</h4>
				<h4>구원을 원하시면 구원게시판을 이용해주세요.</h4>
				<form action="logout.jsp" method="post">
					<p>
						<input type="button" value="홈으로"
							onclick="javascript:window.location='list.jsp'"> <input
							type="submit" value="로그아웃"> <input type="button"
							value="정보수정" onclick="javascript:window.location='modify.jsp'">
					</p>
				</form>
			</div>
		</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>