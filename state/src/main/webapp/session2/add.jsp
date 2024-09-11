<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>속성 추가</title>
</head>
<body>
	<%
		request.setAttribute("A", "A");
		session.setAttribute("B", "B");
	%>
	
	<p> 속성 추가 완료 </p>
	<a href="remove.jsp">속성제거</a>
	<a href="get.jsp">확인하기</a>
	<a href="get2.jsp">확인하기</a>
</body>
</html>