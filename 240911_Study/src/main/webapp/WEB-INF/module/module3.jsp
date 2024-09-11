<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<aside>
	<nav>
		<ul>
			<%
			String ad = (String) request.getAttribute("ad");
			if (ad.equals("스마트 사용자")) {
			%>
			<li><a href="#"></a>노트북 광고</li>
			<li><a href="#"></a>스마트폰 광고</li>

			<%
			} else {
			%>
			<li><a href="#"></a>책상 광고</li>

			<%
			}
			%>
		</ul>
	</nav>
</aside>