<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿의 연산 결과 출력</title>
</head>
<body>
	<c:if test="${ not empty lottoSet }">
	<!-- <p>${ lottoSet }</p>  -->
	
	<ul>
		<c:forEach var="elem" items="${ lottoSet }">
			<li>${ elem }</li>
		</c:forEach>
	</ul>
	</c:if>
</body>
</html>