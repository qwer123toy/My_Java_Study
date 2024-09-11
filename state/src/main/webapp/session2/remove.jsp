<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제거하기</title>
</head>
<body>
	<%
		//session.removeAttribute("B");
		session.invalidate();
	%>
	<a href="get.jsp">확인하기</a>
	<a href="get2.jsp">확인하기</a>
</body>
</html>