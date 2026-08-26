<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>quiz07</h1>
	<c:choose>
		<c:when test="${type == 'str'}">
			<c:forEach var="i" begin="0" end="9" step="1">
				<p>스트링 리스트입니다.[${i+1}]</p>
			</c:forEach>
		</c:when>
		<c:when test="${type == 'member'}">
			<c:forEach var="member" items="${memList}">
				<p>${member.id} ${member.pw} ${member.name}</p>
			</c:forEach>
		</c:when>
	</c:choose>
</body>
</html>







