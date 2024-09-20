<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Welcome</h1>
	<c:if test="${ not empty message }">
		<div>${ message }</div>
		<c:remove var="message" scope="session" />
	</c:if>
	<c:if test="${empty userId }">
		<a href="./userinfo/signup">회원 가입하기</a>
		<a href="./userinfo/login">로그인</a>
	</c:if>
	<c:if test="${ not empty userId }">
		<p>${userId } 님 환영합니다.</p>
		<a href="./listCoffee">커피 목록 보기</a>
		<a href="./userinfo/logout">로그아웃</a>
	</c:if>
</body>
</html>