<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<nav>
		<a href="./insertCoffee">커피 추가하기</a>
	</nav>
	
	<jsp:include page="/WEB-INF/views/searchCoffeeForm.jsp"></jsp:include>
	<p>총 행의 개수 : ${ count } 개 입니다</p>
	<c:if test="${ count > 0 }">
		<ul>
			<c:forEach var="coffee" items="${listCoffee}">
				<li>
					<div>${coffee }</div>

					<div>
						<c:url var="updateURL" value="updateCoffee">
							<c:param name="coffeeId">${coffee.coffeeId }</c:param>
						</c:url>
						<a href="${updateURL }">수정하기</a>

						<c:url var="deleteURL" value="deleteCoffee">
							<c:param name="coffeeId">${coffee.coffeeId }</c:param>
						</c:url>
						<a href="${deleteURL }">삭제하기</a>
					</div>
				</li>
			</c:forEach>
		</ul>
	</c:if>

</body>
</html>