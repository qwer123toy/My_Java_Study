<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page</title>
</head>
<body>
	<%
		String encode = URLEncoder.encode("페이지 상세 내용은 다음과 같습니다", "UTF-8");
		
	%>
	
	<jsp:include page="/WEB-INF/module/module.jsp">
	<jsp:param  name="description" value="<%=encode %>" />
	</jsp:include>
	<article>
		<h1>글 제목</h1>
		<p>컨텐츠 내용</p>
	</article>
	<jsp:include page="/WEB-INF/module/module2.jsp"></jsp:include>
	
	<%
		request.setAttribute("ad", "스마트 사용자");
	%>
	<jsp:include page="/WEB-INF/module/module3.jsp"></jsp:include>
</body>
</html>