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
<title>JSP 게시판 웹 사이트</title>
<style>
.container {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: 5px;
	margin-left: 5px;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">JSP 게시판 사이트</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="list.jsp">자유게시판</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							회원정보 </a>
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
        <input class="form-control me-2" type="search"
						placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
    </div>
</nav>
<div class="container">
							<div class="col-lg-1"></div>
	<div class="col-lg-1">
		<div class="jumbotron" style="padding-top: 20px;">
			<form method="post" action="modifyOk.jsp" name="reg_frm">
				<h3 style="text-align: center;">회원정보 수정</h3>
				<div class="form-group">
				아이디 : <%=dto.getId()%>
				</div>
				<div class="form-group">
					비밀번호 : <input type="password" class="form-control"
												placeholder="비밀번호(최대 길이 20)" name="pw" maxlength="20">
				</div>
				<div class="form-group">
					<input type="password" class="form-control"
												placeholder="비밀번호 확인(비밀번호와 동일)" name="pw_check"
												maxlength="20">
				</div>
				<div class="form-group">
					이름 : <%=dto.getName()%>
				</div>
				<div class="form-group">
					메일 : <input type="email" class="form-control" placeholder="메일"
												name="eMail" maxlength="20">
				</div>
				<div class="form-group">
					주소 : <input type="text" class="form-control" placeholder="주소"
												name="address" maxlength="50">
				</div>
			<input type="button" value="수정" onclick="updateInfoConfirm()">
			<input type="reset" value="취소" onclick="javascript:window.location='main.jsp'">
			</form>
		</div>	
	</div>
</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>

					</body>
</html>