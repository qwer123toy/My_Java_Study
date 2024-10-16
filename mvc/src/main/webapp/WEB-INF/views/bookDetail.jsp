<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ empty book }">
		<p> 책 정보를 검색할 수 없습니다.</p>
	</c:if>
	
	<c:if test="${ not empty book }">
		<p> 제목 : ${ book.title }</p>
		<p> 작가명 : ${ book.author }</p>
		<p> 출판사 : ${ book.publisher }</p>
		<p> 가격 : ${ book.price }</p>
	</c:if>
	
	<a href="../book">목록 보기</a>
</body>
</html>