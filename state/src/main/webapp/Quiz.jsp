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

	String preQuiz = request.getParameter("quiz");
	String answer = request.getParameter("answer"); // 사용자가 제출한 답을 서버에서 받음
	Integer count = 0;
	List<String> quizDupChkList = (List<String>) session.getAttribute("quizDupChkList");

	
	if (quizDupChkList == null) {
		quizDupChkList = new ArrayList<>(); // 새로운 리스트 생성
		session.setAttribute("quizDupChkList", quizDupChkList); // 세션에 저장
	}

	// 중복되지 않은 문제를 찾기 위한 반복문
	String selectedQuiz = null;
	for (String quiz : quizList) {
		if (!quizDupChkList.contains(quiz)) { // 중복 체크 리스트에 없는 문제를 선택
			selectedQuiz = quiz;
			quizDupChkList.add(selectedQuiz); // 중복 체크 리스트에 추가
			break;
		}
	}

	if (selectedQuiz == null) {
		quizDupChkList.clear(); // 리스트 초기화
		selectedQuiz = quizList.get(0); // 첫 번째 문제 선택
		quizDupChkList.add(selectedQuiz); // 중복 체크 리스트에 추가
	}
	%>
	<form action="Quiz.jsp">
		<p><%=count%></p>
		<div  id="quiz" name="quiz"><%=selectedQuiz%></div>
		<!-- 중복되지 않은 문제 출력 -->
		<input type="text" name="answer" id="answer"> <input
			type="submit">
	</form>

	<script>
    let dialog = document.querySelector("#answer");
    let serverAnswer = "<%=answer%>
		";
	</script>
	<%
	count = (Integer) session.getAttribute("count");
	
	
	if (count == null) {
		count = 1; // count가 null일 경우 초기화
	} else {
		boolean chkAnswer = false;
		for (Map.Entry<String, String> entry : quizMap.entrySet()) {
			String realQuiz = entry.getKey();
			String realAnswer = entry.getValue();
			//System.out.println(realAnswer);
			if (realQuiz.equals(preQuiz) && realAnswer.equals(answer)) {
				count++;
				chkAnswer = true;
				System.out.println("정답");
			}
		}
		/*if (!chkAnswer) {// 오답일 경우
			count = 1;
			quizDupChkList.clear(); // 퀴즈 중복 체크 리스트도 초기화
			System.out.println("오답");
		}*/

	}

	// count가 5 이상일 경우 초기화
	if (count > 5) {
		count = 1;
		quizDupChkList.clear(); // 퀴즈 중복 체크 리스트도 초기화
		System.out.println("5번 다 맞춤");
	}

	session.setAttribute("count", count); // count 세션에 저장
	session.setAttribute("quizDupChkList", quizDupChkList); // 퀴즈 리스트 세션에 저장
	//    session.setAttribute("answer", quizDupChkList); // 퀴즈 리스트 세션에 저장
	%>


</body>
</html>