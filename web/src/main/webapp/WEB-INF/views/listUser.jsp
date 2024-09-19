<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="./insertUser">유저 추가하기</a>
	</nav>
	<ul>
		<c:forEach var="user" items="${listUser}">
			<li>
				<div>아이디 : ${user.userId }</div>
				<div>이름 : ${user.userName }</div>
				<div>생성 날짜 : ${user.createdAt }</div>
			</li>
		</c:forEach>
	</ul>
</body>
</html>