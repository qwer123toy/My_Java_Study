<%@page import="java.util.Map"%>
<%@page import="quiz.Quizs"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
	String answer = request.getParameter("answer");
	String quiz = request.getParameter("quiz");
	boolean chkAnswer = false;
	
	String decodeQuiz = null;
	String decodeAnswer = null;
	
	if (answer != null) {
		decodeQuiz = URLDecoder.decode(quiz, "UTF-8");
		decodeAnswer = URLDecoder.decode(answer, "UTF-8");
	
		Quizs quizs = new Quizs();
		Map<String, String> quizMap = quizs.getUsers();
	
		for (Map.Entry<String, String> entry : quizMap.entrySet()) {
			String realUserID = entry.getKey();
			String realUserPW = entry.getValue();
	
			if (realUserID.equals(decodeQuiz) && realUserPW.equals(decodeAnswer)) {
				chkAnswer = true;
				System.out.println(decodeQuiz);
				System.out.println(decodeAnswer);
			}
	
		}
		
	}
	%>
	<footer>
	
		<%
		if (answer != null) {
			out.println("<h2>" + "정답" + "</h2>");
		}
		%>

</footer>