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

<%--  --%>
<div class="container">
	<h3 style="color:#0D0259"><Strong>구원 게시판</Strong></h3>
	<h5 style="color:#202D73">고통받고 있다면 구원을 요청하세요</h5>
</div>

<div class="container" style="background-color:#F2F2F0; 	padding-bottom: 15px;
	padding-top: 15px; border-radius: 10px;">
	<form action="modify.do" method="post">
		<input type="hidden" name="bId" value="${content_view.bId}">
		<input type="hidden" name="bCate" value="${content_view.bCate}">
		<input type="hidden" name="bName" value="${content_view.bName}">
		<div class="form-group">
			<label for="bId">번호</label> <input type="text" class="form-control"
				name="bId" placeholder="${content_view.bId}" readonly>
		</div>
		<div class="form-group">
			<label for="bCate">카테고리</label> <input type="text" class="form-control"
				name="bCate" placeholder="${content_view.bCate}" readonly>
		</div>
		<div class="form-group">
			<label for="bTitle">제목</label> <input type="text" class="form-control" name="bTitle" value="${content_view.bTitle}">
		</div>
		<div class="form-group">
			<label for="bContent">내용</label>
			<textarea rows="10" class="form-control" name="bContent">${content_view.bContent}</textarea>
		</div>
		<div>
			<td colspan="2"><button type="submit" value="수정" class="btn btn-success btn-sm">입력</button> &nbsp;&nbsp;
			<a href="content_view.do?bId=${content_view.bId}" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">취소</a>&nbsp;&nbsp;
			<a href="list.do?page=<%= session.getAttribute("cpage")%>" class="btn btn-primary btn-lg active btn-sm" role="button" aria-pressed="true">목록보기</a>&nbsp;&nbsp;
			</td>
		</div>
	</form>
</div>

<%--   --%>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>