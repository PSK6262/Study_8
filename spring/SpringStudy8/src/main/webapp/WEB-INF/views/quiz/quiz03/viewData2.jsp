<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>viewData Page</h1>
	<%=request.getAttribute("item") %>
	<%=request.getAttribute("type") %>
	
	<div>
		<p>${item}</p>
		<p>${type}</p>
	</div>
	<div>
		${drinkItem.item}
		${drinkItem.type}
	</div>
</body>
</html>