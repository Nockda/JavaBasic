<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.study.member.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-eqiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" , initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>회원가입</title>
<script language="Javascript" src="members.js"></script>
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
			<form method="post" action="joinOk.jsp" name="reg_frm">
				<h3 style="text-align: center;">회원가입 화면</h3>
				<div class="form-group">
					아이디 : <input type="text" class="form-control" placeholder="아이디"
						name="id" maxlength="20">
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
					이름 : <input type="text" class="form-control" placeholder="이름"
						name="name" maxlength="20">
				</div>
				<div class="form-group">
					메일 : <input type="email" class="form-control" placeholder="메일"
						name="eMail" maxlength="20">
				</div>
				<div class="form-group">
					주소 : <input type="text" class="form-control" placeholder="주소"
						name="address" maxlength="50">
				</div>
				<input type="button" value="회원가입" onclick="infoConfirm()">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="로그인"
					onclick="javascript:window.location='Login.jsp'">
			</form>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>