<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./naver-editor/js/service/HuskyEZCreator.js" charset="utf-8"></script>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
	<form action="write.do" method = "post">
		<tr>
			<td>이름</td>
			<td><input type="text" name="bName" size="50"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="bTitle" size="50"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="bContent" id="bContent" rows="10" cols="100">에디터에 기본으로 삽입할 글(수정 모드)이 없다면 이 value 값을 지정하지 않으시면 됩니다.</textarea></td>
			<script type="text/javascript">
			var oEditors = [];
			nhn.husky.EZCreator.createInIFrame({
			    oAppRef: oEditors,
			    elPlaceHolder: "ir1",
			    sSkinURI: "./naver-editor/SmartEditor2Skin.html",
			    fCreator: "createSEditor2"
			});
			</script>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="입력">&nbsp;&nbsp;
				<a href="list.do">목록보기</a>
			</td>
		</tr>
	</form>
</table>
</body>
</html>