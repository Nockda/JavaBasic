<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<table class = "table table-striped">
	<thead>
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>제목</td>
		<td>날짜</td>
		<td>히트</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${list}" var = "dto">
	<tr>
		<td>${dto.bId}</td>
		<td>${dto.bName}</td>
		<td>
			<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
			<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
		<td>${dto.bDate}</td>
		<td>${dto.bHit}</td>
	</tr>
	</c:forEach>
	</tbody>
	<tr>
		<td colspan="5"><a href="write_view.do">글작성</a></td>
	</tr>
	<tr>
		<td colspan="5">
		<!-- 처음 -->
		<c:choose>
		<c:when test="${(page.curPage -1) <1 }">
			[&lt;&lt;]
		</c:when>
		<c:otherwise>
			<a href="list.do?page=1">[&lt;&lt;]</a>
		</c:otherwise>
		</c:choose>
		<!-- 이전 -->
		<c:choose>
		<c:when test="${(page.curPage -1) <1}">
			[&lt;]
		</c:when>
		</c:choose>
		
		<!-- 개별 페이지 -->
		<c:forEach var="fEach" begin="${page.startPage}" end="${page.endPage}" step="1">
		<c:choose>
		<c:when test="${page.curPage ==fEach}">
			[${fEach}]&nbsp;
		</c:when>
			<c:otherwise>
			<a href="list.do?page=${fEach}">[${fEach}]</a>&nbsp;
			</c:otherwise>
		</c:choose>
		</c:forEach>
		
		<!-- 다음 -->
		<c:choose>
		<c:when test="${(page.curPage + 1)>page.totalPage}">
			[&gt;]
		</c:when>
		<c:otherwise>
			<a href="list.do?page=${page.curPage+1}">[&gt;]</a>
		</c:otherwise>
		</c:choose>
		<!-- 끝 -->
		<c:choose>
		<c:when test="${page.curPage==page.totalPage}">
			[&gt;&gt;]
		</c:when>
		<c:otherwise>
			<a href="list.do?page=${page.totalPage}">[&gt;&gt;]</a>
		</c:otherwise>
		</c:choose>
		</td>
		</tr>
</table>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>