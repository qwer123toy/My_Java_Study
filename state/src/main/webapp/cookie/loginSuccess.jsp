<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    // request.setAttribute("login", "success");
    // 위 코드는 request 속성에 값을 저장하는 방식입니다.
    // 하지만 request는 서버 내에서만 유지되고 새로운 요청이 발생하면 정보가 사라지기 때문에 쿠키로 대신 처리합니다.

    // 쿠키 생성: 이름이 "login"이고 값이 "success"인 쿠키를 생성
    Cookie cookie = new Cookie("login", "success");
    
    // 쿠키는 만료기한이 있음
    //24시간 동안 만료기한 설정하기
	cookie.setMaxAge(60*60*24);

    
    // 생성한 쿠키를 클라이언트에 전송하여 브라우저에 저장하도록 함
    response.addCookie(cookie);
%>

    <p>로그인에 성공했습니다.</p>
    <!-- 로그인한 유저만 접근할 수 있는 페이지로 이동할 수 있는 링크 -->
    <a href="onlyForLoginUser.jsp">로그인 한 유저만 접근 가능</a>
</body>
</html>
