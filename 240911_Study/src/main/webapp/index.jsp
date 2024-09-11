<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<!-- jsp에서만 사용가능한 jsp 액션 태그 -->
	<jsp:include page="/WEB-INF/module/module.jsp"></jsp:include>
	<p>홈페이지 소개 내용</p>
	<nav>
		<a href="page.jsp">컨텐츠 보기</a>
	</nav>
	<jsp:include page="/WEB-INF/module/module2.jsp"></jsp:include>
</body>
</html>