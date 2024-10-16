<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ empty student }">
		<p> 책 정보를 검색할 수 없습니다.</p>
	</c:if>
	
	<c:if test="${ not empty student }">
		<p> 이름 : ${ student.lastName }${ student.firstName }</p>
		<p> 국어 : ${ student.korean }</p>
		<p> 영어 : ${ student.english }</p>
		<p> 수학 : ${ student.math }</p>
	</c:if>
	<!-- 두 버튼이 POST로 같은 요청을 보내지만 name과 value로 서버에서 구분 -->
	<form method="post">
		<input type="hidden" name="studentId" value="${student.no }">
		<!-- 삭제하기 버튼 -->
		<button type="submit" name="action" value="delete">삭제하기</button>
		<!-- 수정하기 버튼 -->
		<button type="submit" name="action" value="update">수정하기</button>
	</form>
	<a href="../student">목록 보기</a>
</body>
</html>