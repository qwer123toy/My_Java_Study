<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 수정 양식</title>
</head>
<body>
	<form method="post">
		<input type="hidden" name="coffeeId" value="${ coffee.coffeeId }">
		<input type="text" name="coffeeName" value="${ coffee.coffeeName }" readonly>
		<input type="number" name="coffeePrice" value="${ coffee.coffeePrice }">
		<input type="submit">
	</form>
</body>
</html>