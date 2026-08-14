<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>메인 페이지</h1>
	<button type="button" id="sendToCreateAccount">회원가입 하러 가기</button>
	<script>
		document.getElementById("sendToCreateAccount").addEventListener('click', ()=>{
			location.href = "/customer/signup";
		})
	</script>
</body>
</html>