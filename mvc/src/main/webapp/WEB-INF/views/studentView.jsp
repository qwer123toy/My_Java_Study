<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="/student/form">책 추가하기</a>
	
	<c:if test="${ not empty list }">
		<ul>
			<c:forEach var="student" items="${list }">
				<c:url var="link" value="${ '/student/' += student.no }">
				</c:url>
				<li><a href="${link}">${student.no }번 ${student.firstName } 살펴보기</a></li>
			</c:forEach>
		</ul>
	</c:if>
	<nav>
		<c:forEach var="num" begin="0" end="${totalPages-1 }">
			<c:url var="pages" value="/student">
				<c:param name="page">${num }</c:param>
				<c:param name="size">${size }</c:param>
			</c:url>
			<a href="${pages }">${num }</a>
		</c:forEach>
	</nav>
</body>
</html>