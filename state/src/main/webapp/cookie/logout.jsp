<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<%
	// "login"이라는 이름의 쿠키를 생성. 기존의 값을 지우기 위해 빈 문자열("")로 설정
	Cookie cookie = new Cookie("login", "");

	// 쿠키의 유효 기간을 0으로 설정. 이 값은 쿠키를 즉시 삭제하라는 의미
	cookie.setMaxAge(0);

	// 변경된 쿠키 정보를 클라이언트(브라우저)에 전송하여 해당 쿠키를 삭제함
	response.addCookie(cookie);
	//쿠키엔 민감정보를 넣으면 위험함
	// 정보 수정이 어렵지 않기 때문에 가벼운 정보만 넣을 것
	%>
	<p>로그아웃 되셨습니다</p>
</body>
</html>
