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
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
<style>
.container {
  padding-right: 15px;
  padding-left: 15px;
  margin-right: 5px;
  margin-left: 5px;
}
h1{
text-align:center;}

</style>

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

<div class="container">
  <div class="row">
    <div class="col-sm">
    <br>
    <h1>전체 회원 목록</h1><hr>
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
		    	<th scope="col">MGR</th>
		    </tr>
	 	</thead>
	  	<tbody>
	  	
	  	<%
	  	for(int i=0; i < num; i++){
	  	%>
	  	<tr>
		      <th scope="row">1</th>
		      <td>ID</td>
		      <td>PW</td>
		      <td>name</td>
		      <td>email</td>
		      <td>rdate</td>
		      <td>address</td>
		      <td>mgr</td>
		</tr>
	  	<%	
	  	}
	  	%>
	 	</tbody>
	</table>
    </div>
  </div>
</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>