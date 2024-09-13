<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿의 연산 결과 출력</title>
</head>
<body>

	<form method="POST">
		<label>자동 생성할 개수: <input type="number" name="num"
			min="1"
			max="5"
			value="1"
			required
		></label>
		<input type="submit">
	</form>

</body>
</html>