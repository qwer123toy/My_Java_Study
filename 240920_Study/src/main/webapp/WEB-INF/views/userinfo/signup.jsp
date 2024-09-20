<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 양식</title>
<link rel="stylesheet" type="text/css"
	href="${ pageContext.request.contextPath }/static/css/userinfo.css">
</head>
<body>
	<div class="error hidden">비밀번호가 일치하지 않습니다</div>
	<c:if test="${ not empty error }">
		<div class="error">
			<c:forEach var="msg" items="${ error }">
				<span>${ msg.value }</span>
			</c:forEach>
		</div>
	</c:if>	

	<form method="POST" id="userinfoForm">
		<label>아이디 <input type="text" name="userId" maxlength="20"
			required  value="${userinfo.userId}"></label> <label>비밀번호 <input type="password"
			id="userPw" name="userPw" maxlength="20" required></label> <label>비밀번호
			확인 <input type="password" id="userPwConfirm" name="userPwConfirm"
			maxlength="20" required>
		</label> <label>사용자이름 <input type="text" name="userName"
			maxlength="20" required value="${userinfo.userName }"></label> <input type="submit" value="회원가입">
	</form>
</body>


<c:url var="jsUrl" value="/static/js/userinfo.js"></c:url>
<script src=${ jsUrl }></script>

<%-- <script src="${ pageContext.request.contextPath }/userinfo.js"></script> --%>
</html>