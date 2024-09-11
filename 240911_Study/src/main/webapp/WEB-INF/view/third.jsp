<%@page import="jsp2.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<%
    // second.jsp에서 설정한 request 속성에서 Book 객체를 받아옴
    // sendRedirect를 사용했다면 새로운 요청이기 때문에 속성에 저장된 데이터는 사라졌겠지만,
    // jsp:forward를 사용했으므로 동일한 request 객체가 유지되어 result 값을 받을 수 있음
    Book result = (Book) request.getAttribute("result");
%>
    <!-- 검색된 도서 결과를 화면에 출력 -->
    <p> 검색결과 <%=result %> </p>
</body>
</html>
