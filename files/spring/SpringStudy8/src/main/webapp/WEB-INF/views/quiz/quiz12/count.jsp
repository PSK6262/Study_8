<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${ empty loginId }">
			<h1> 로그인 해 주세요 </h1>
		</c:when>
		<c:otherwise>
			<h1> count page </h1>
			<h2> ${id} 님이 접속하였습니다. </h2>
			<h3> ${count}회 접속 </h3>
		</c:otherwise>
	</c:choose>
</body>
</html>