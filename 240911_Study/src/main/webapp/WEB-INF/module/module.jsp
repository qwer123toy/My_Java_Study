<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String description = request.getParameter("description");
    	String decode = null;	
  	
    	if(description !=null){
    	decode = URLDecoder.decode(description, "UTF-8");
    	}
    %>
<header>
	<h1>홈피</h1>
	<%
		if(description != null){
			out.println("<h2>" + decode + "</h2>");
		}
	%>
</header>