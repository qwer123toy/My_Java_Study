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
		Integer count = null;
	
		count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		session.setAttribute("count", count);
	%>
<p>현재 페이지 조회 수 : <%= count %></p>
</body>
</html>