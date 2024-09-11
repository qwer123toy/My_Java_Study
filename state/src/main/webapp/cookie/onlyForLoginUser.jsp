<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인을 한 유저를 위한 페이지</title>
</head>
<body>
<%
    // request 객체는 매 요청마다 새로 생성되므로, 이전에 설정했던 request 속성은 사라집니다.
    // 따라서 쿠키를 이용해 로그인 여부를 확인합니다.

    // 클라이언트로부터 전송된 쿠키 배열을 가져옴
    Cookie[] cookies = request.getCookies();
    String login = null;

    // 모든 쿠키를 순회하여, "login"이라는 이름의 쿠키가 있는지 확인
    for (Cookie c : cookies) {
        String cookieName = c.getName(); // 현재 쿠키의 이름을 가져옴

        // 쿠키 이름이 "login"이면, 해당 쿠키의 값을 가져와서 변수 login에 저장
        if (cookieName.equals("login")) {
            login = c.getValue(); // 쿠키 값이 "success"이면 로그인 상태
        }
    }

    // 로그인 쿠키가 존재하고, 값이 "success"인 경우
    if (login != null && login.equals("success")) {
%>
    <p>회원님 환영합니다</p>
<%
    } else {
        // 쿠키가 없거나, 값이 "success"가 아닌 경우
%>
    <p>로그인 부터 수행해주세요</p>
<%
    }
%>
</body>
</html>
