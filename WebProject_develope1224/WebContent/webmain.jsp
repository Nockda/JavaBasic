<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Insert title here</title>
<style>
h1 {
text-align:center;
color:red;}
h4 {
text-align:center;}
img{
display : block; margin:0px auto;}
input {
text-align:center;}
p {
text-align:center;}
.navbar-brand {
font-size:35px;

}
@font-face {
    font-family: 'nd';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.3/NeoDunggeunmo.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
body{
font-family:nd
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

<div class="jumbotron" style="padding-top: 20px;">
	<div class="container-fluid">
		<h1 id="head"><strong>Welcome to the Hell</strong></h1><br><br>
		<h4 id="desc">Html, CSS, JSP, BBS 때문에 골머리를 앓고 계신다고요?</h4>
		<h4 id="desc">하고싶은건 많은데 어떻게 해야 할지 모르신다구요?</h4>
		<h4 id="head">잘 오셨습니다!</h4>
		<h4 id="head">여기는 여러분들을 위한 Hell입니다.</h4><br>
		<img src="letsgo.png" alt="Let's go to the hell!"></img><br><hr>
		<p><input type="button" value="회원가입" onclick="javascript:window.location='join.jsp'">
		<input type="submit" value="로그인" onclick="javascript:window.location='Login.jsp'">&nbsp;&nbsp;&nbsp;</p>
	</div>
</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>