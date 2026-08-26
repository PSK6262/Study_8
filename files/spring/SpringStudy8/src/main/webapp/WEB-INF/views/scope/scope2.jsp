<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope2</h1>
	
	<p>${requestScope.requestMsg}</p>
	<p>${requestMsg}</p>
	
	<p>${sessionScope.sessionMsg}</p>
	<p>${sessionMsg}</p>
	
	<p>${applicationScope.appMsg}</p>
	<p>${appMsg}</p>

</body>
</html>