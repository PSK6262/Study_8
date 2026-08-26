<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>이름 : ${userId} </div>
	<form action="" method="post">
		<label>패스워드<input type="password" name="pw"></label><br>
		<button type="submit">변경하기</button>
	</form>
	<input type="button" onclick="location.href='/main' " value="메인 화면으로 돌아가기">
</body>
</html>