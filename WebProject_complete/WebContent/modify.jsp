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
<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<script language="Javascript" src="members.js"></script>
<title>JSP 게시판 웹 사이트</title>
<style>
.container {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
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

.navbar-brand {
	font-size: 35px;
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


	<div class="jumbotron" style="padding-top: 20px;">
		<div class="container">
			<form method="post" action="modifyOk.jsp" name="reg_frm">
				<h3 style="text-align: center;">회원정보 수정</h3>
				<div class="form-group">
					아이디 :
					<%=dto.getId()%>
				</div>
				<div class="form-group">
					비밀번호 : <input type="password" class="form-control"
						placeholder="비밀번호(최대 길이 20)" name="pw" maxlength="20">
				</div>
				<div class="form-group">
					<input type="password" class="form-control"
						placeholder="비밀번호 확인(비밀번호와 동일)" name="pw_check" maxlength="20">
				</div>
				<div class="form-group">
					이름 :
					<%=dto.getName()%>
				</div>
				<div class="form-group">
					메일 : <input type="email" class="form-control"
						placeholder="<%=dto.geteMail()%>" name="eMail" maxlength="50">
				</div>
				<div class="form-group">
					주소 : <input type="text" class="form-control"
						placeholder="<%=dto.getAddress()%>" name="address" maxlength="50">
				</div>
				<input type="button" value="수정" onclick="updateInfoConfirm()">
				<input type="reset" value="취소"
					onclick="javascript:window.location='main.jsp'">
			</form>
			<br>
			<hr>
			<a href="delete.jsp">회원탈퇴</a>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>