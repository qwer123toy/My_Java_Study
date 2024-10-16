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
	<f:form modelAttribute="studentCommand" method="POST">
		<label>성<f:input type="text" id="lastName" path="lastName" /></label>
		<f:errors path="lastName"></f:errors>
		<label>이름<f:input type="text" id="firstName" path="firstName" /></label>
		<f:errors path="firstName"></f:errors>
		<label>국어<f:input type="number" id="korean" path="korean" /></label>
		<f:errors path="korean"></f:errors>
		<label>영어<f:input type="number" id="english" path="english" /></label>
		<f:errors path="english"></f:errors>
		<label>수학<f:input type="number" id="math" path="math" /></label>
		<f:errors path="math"></f:errors>
		<input type="submit">
	</f:form>
</body>
</html>