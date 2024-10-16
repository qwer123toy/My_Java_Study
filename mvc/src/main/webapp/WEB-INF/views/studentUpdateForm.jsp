<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가하기</title>
</head>
<body>
	<form  method="POST">
		<label>성<input type="text" id="lastName" name="lastName" value="${student.lastName }" /></label>
		<label>이름<input type="text" id="firstName" name="firstName" value="${student.firstName }" /></label>
		<label>국어<input type="number" id="korean" name="korean" value="${student.korean }" /></label>
		<label>영어<input type="number" id="english" name="english" value="${student.english }"/></label>
		<label>수학<input type="number" id="math" name="math" value="${student.math }"/></label>
		<input type="submit">
	</form>
</body>
</html>