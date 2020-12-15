<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
	function form_check() {
		submit_ajax();
	}

	function submit_ajax() {
		var queryString = $("#JoinProcess").serialize();
		$.ajax({
			url : '/jsp19_ajax/JoinProcess',
			type : 'POST',
			data : queryString,
			dataType : 'json',
			success : function(json) {
				var result = eval(json);
				console.log(results);
				if (results[0].result == "ok") {
					alert("정상 가입되었습니다.")
					window.location.replace("login.jsp");
				} else {
					alert(result[0].desc);
				}
			}
		});
	}
</script>
</head>
<body>
	<form name="JoinProcess" id="JoinProcess">
		아이디 : <input type="text" name="id" size="10"><br> 비밀번호 :
		<input type="password" name="pw" size="10"><br> 이름 : <input
			type="text" name="name" size="10"><br> 전화번호 : <select
			name="phone1">
			<option value="010">010</option>
			<option value="019">019</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="012">012</option>
			<option value="013">013</option>
		</select> - <input type="text" name="phone2" size="5"> - <input
			type="text" name="phone3" size="5"><br> 성별 : <input
			type="radio" name="gender" value="male">남 &nbsp; <input
			type="radio" name="gender" value="female">여<br> <input
			type="button" value="회원가입" onclick="form_check()" /><input
			type="reset" value="리셋">
	</form>

</body>
</html>