<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String login = (String) session.getAttribute("login");
	if(login !=null && login.equals("success")){
		out.println("<h1>로그인 상태값 확인 </h1>");
	}
	else{
		out.println("<h1>세션에 값 없음 </h1>");
	}
%>
</body>
</html>