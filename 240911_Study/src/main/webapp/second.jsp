<%@page import="jsp2.Book"%>
<%@page import="jsp2.BookRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // BookRepository 클래스를 사용하여 도서 목록에서 도서를 검색
    BookRepository repo = new BookRepository();

    // 사용자가 입력한 도서 제목과 가격을 파라미터로 받아옴
    String title = request.getParameter("title");
    String price = request.getParameter("price");
    
    // 받아온 가격을 정수로 변환 (가격이 숫자로 입력되었음을 가정)
    int parsePrice = Integer.parseInt(price);

    // 입력된 제목과 가격으로 새로운 Book 객체를 생성하고, 그 책을 레포지토리에서 찾음
    Book find = repo.find(new Book(title, parsePrice));
    
    // 찾은 결과(Book 객체)를 request 속성에 저장하여 다른 페이지로 전달
    request.setAttribute("result", find);
    
    // sendRedirect를 사용하면 새로운 요청이 생성되므로 request 속성에 저장된 데이터를 전달할 수 없음
    // response.sendRedirect("/240911_Study/third.jsp"); --> 값을 전달할 수 없는 방법

    // 사용했던 request를 그대로 사용하여 정보를 포워딩한 뒤 넘겨줌
    // 기존 request를 동일하게 넘겨주기 때문에 정보를 넘겨 줄 수 있음
    // 다만 third.jsp로 이동하는 것이 아니라 second.jsp에서 이어지는 것으로 연결됨
    request.getRequestDispatcher("/WEB-INF/view/third.jsp").forward(request, response);
   
%>
<!-- 대신 jsp:forward를 사용하면 동일한 request 객체를 유지하면서 다른 페이지로 포워딩할 수 있음 -->
<!-- third.jsp 페이지로 현재 요청(request)를 포워딩하여 검색 결과를 전달 -->
<!-- <jsp:forward page="third.jsp"></jsp:forward> -->
