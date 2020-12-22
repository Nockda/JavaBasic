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

	<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>${content_view.bId}</td>
	</tr>
	<tr>
		<td>히트</td>
		<td>${content_view.bHit}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${content_view.bName}</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${content_view.bTitle}</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>${content_view.bContent}</td>
	</tr>
	<tr>
		<td colspan="2">
		<a href="modify_view.do?bId=${content_view.bId}">수정</a>
		<a href="list.do?page=<%= session.getAttribute("cpage")%>">목록보기</a>&nbsp;&nbsp;
		<a href="delete.do?bId=${content_view.bId}">삭제</a>&nbsp;&nbsp;
		<a href="reply_view.do?bId=${content_view.bId}">답변</a>&nbsp;&nbsp;
		</td>
	</tr>
	</table>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>