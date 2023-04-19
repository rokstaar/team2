<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>loginForm.jsp</h1>
	<form action="/members/login" method="post">
		아이디 : <input type="text" name="member_id">
		비밀번호 : <input type="password" name="member_pass">
		<input type="submit" value="로그인">
	</form>

</body>
</html>