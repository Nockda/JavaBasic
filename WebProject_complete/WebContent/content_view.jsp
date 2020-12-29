<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.navbar-brand {
font-size:35px;

}
@font-face {
    font-family: 'nd';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.3/NeoDunggeunmo.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
nav{
font-family:nd
}
td{
width:200px;
}
th{
width: 10px;
}
#content{
width:90%;
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
	margin-top:10px;
	}
#cont{
height:300px;
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
          <a class="nav-link active" aria-current="page" href="main.jsp"><Strong>Welcome to the hell</Strong></a>
        </li>
        <!--  -->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell talk
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="list.do">구원게시판</a></li>
          </ul>
        <li class="nav-item">
        <!--  -->
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell's Member
        </a>
        <!--  -->
        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
         	<li><a class="dropdown-item" href="join.jsp">지옥주민신청</a></li>
         	<li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="Login.jsp">로그인</a></li>
            <li><a class="dropdown-item" href="modify.jsp">정보변경</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="logout.jsp">로그아웃</a></li>
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

<div class="container-fluid" id="content">
	<table class="table table-bordered" style="border:2; bordercolor:black;">
	<thead>
	<tr>
	<th colspan="2" style="font-size:20px; color:#0D0259; background-color:#F2F2F0;">&nbsp;&nbsp;&nbsp;<strong>자유게시판</strong></th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<th style="background-color:#F2F2F0;">번호</th>
		<td>${content_view.bId}</td>
	</tr>
	<tr>
		<th style="background-color:#F2F2F0;">히트</th>
		<td>${content_view.bHit}</td>
	</tr>
	<tr>
		<th style="background-color:#F2F2F0;">카테고리</th>
		<td>${content_view.bCate}</td>
	</tr>
	<tr>
		<th style="background-color:#F2F2F0;">이름</th>
		<td>${content_view.bName}</td>
	</tr>
	<tr>
		<th style="background-color:#F2F2F0;">제목</th>
		<td>${content_view.bTitle}</td>
	</tr>
	<tr>
		<th colspan="2" style="background-color:#F2F2F0;">내용</th>
	</tr>
	<tr>
		<td colspan="2" id="cont">${content_view.bContent}</td>
	</tr>
	<tr>
		<td colspan="2">
		<a href="modify_view.do?bId=${content_view.bId}" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">수정</a>&nbsp;
		<a href="list.do?page=<%= session.getAttribute("cpage")%>" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">목록보기</a>&nbsp;
		<a href="delete.do?bId=${content_view.bId}" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">삭제</a>&nbsp;
		<a href="reply_view.do?bId=${content_view.bId}" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">답변</a>&nbsp;
		</td>
	</tr>
	</tbody>
	</table>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</div>
</body>
</html>