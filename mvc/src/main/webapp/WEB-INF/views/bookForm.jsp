<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 추가하기</title>
</head>
<body>
	<f:form modelAttribute="bookCommand" method="POST">
		<label>제목<f:input type="text" id="title" path="title" /></label>
		<f:errors path="title"></f:errors>
		<label>저자<f:input type="text" id="author" path="author" /></label>
		<f:errors path="author"></f:errors>
		<label>출판사<f:input type="text" id="publisher" path="publisher" /></label>
		<f:errors path="publisher"></f:errors>
		<label>가격<f:input type="number" id="price" path="price" /></label>
		<f:errors path="price"></f:errors>
		<input type="submit">
	</f:form>
</body>
</html>