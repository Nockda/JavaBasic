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
    <a class="navbar-brand" href="webmain.jsp">W.T.H</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="main.jsp">Welcome to the hell</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="list.jsp">Hell talk</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Hell's Member Desk
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
         	<li><a class="dropdown-item" href="join.jsp">Registration</a></li>
         	<li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="Login.jsp">Login</a></li>
            <li><a class="dropdown-item" href="modify.jsp">Modify</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="logout.jsp">Logout</a></li>
          </ul>
        <li class="nav-item">
          <a class="nav-link" href="mgrMain.jsp">Hell Manager</a>
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
		<form action="reply.do" method="post">
		<input type="hidden" name="bId" value="${reply_view.bId}">
		<input type="hidden" name="bGroup" value="${reply_view.bGroup}">
		<input type="hidden" name="bStep" value="${reply_view.bStep}">
		<input type="hidden" name="bIndent" value="${reply_view.bIndent}">
		<tr>
			<td>번호</td>
			<td>${reply_view.bId}</td>
		</tr>
		<tr>
			<td>히트</td>
			<td>${reply_view.bHit}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="bName" value="${reply_view.bHit}"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="bTitle" value="${reply_view.bTitle}"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" name="bContent">${reply_view.bContent}</textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="답변">
			<a href="list.do?page=<%=session.getAttribute("cpage")%>">목록</a></td>
		</tr>
		</form>
	
	</table>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>