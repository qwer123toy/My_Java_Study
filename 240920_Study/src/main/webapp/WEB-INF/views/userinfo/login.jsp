<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<%-- 브라우저 상의 입력값 유효 확인은 생략 (signup.jsp 참고) --%>
	<form method="POST">
		<input type="text" name="userId">
		<input type="password" name="userPw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>