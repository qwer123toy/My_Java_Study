<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인에 성공하셨습니다.</title>
</head>
<body>
	<%
		session.setAttribute("login", "success");
	%>
	<p>로그인에 성공하셨습니다.</p>
</body>
</html>