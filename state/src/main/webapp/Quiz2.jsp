<%@page import="java.net.URLEncoder"%>
<%@page import="javax.swing.text.Document"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="quiz.Quizs"%>
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
    Quizs quizs = new Quizs();
    Map<String, String> quizMap = quizs.getUsers();
    List<String> quizList = new ArrayList<>(quizs.getUsers().keySet());
    Collections.shuffle(quizList); // 퀴즈 목록을 섞음

    String answer = request.getParameter("answer"); // 사용자가 제출한 답을 서버에서 받음 (여기에 값을 받아옴)
    Integer count = 0;
    String encode = "";
    String quiz = quizList.get(0);
    String encodeQuiz = quiz;
    // answer가 null일 때 처리
    if (answer != null) {
        encode = URLEncoder.encode(answer, "UTF-8"); // answer가 null이 아닐 때만 인코딩
        encodeQuiz = URLEncoder.encode(quiz, "UTF-8"); // answer가 null이 아닐 때만 인코딩
    }
%>

<!-- HTML Form -->
<form action="Quiz2.jsp">
    <p><%=count%></p>
    <div id="quiz"><%=quizList.get(0)%></div> <!-- 퀴즈 질문 표시 -->
    
    <input type="text" name="answer" id="answer"> <!-- 사용자가 답을 입력할 필드 -->
    <input type="submit">
</form>

<!-- JSP include로 다른 모듈을 삽입 -->
<jsp:include page="answermodule.jsp">
    <jsp:param name="answer" value="<%=encode %>" />
    <jsp:param name="quiz" value="<%=encodeQuiz %>" />
</jsp:include>

<script>
    // HTML input 필드와 서버에서 가져온 answer 값
    let dialog = document.querySelector("#answer");
    let serverAnswer = "<%=answer != null ? answer : ""%>"; // JSP answer 값을 JavaScript로 전달
    
</script>


</body>
</html>