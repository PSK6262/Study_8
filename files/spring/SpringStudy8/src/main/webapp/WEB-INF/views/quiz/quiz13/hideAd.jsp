<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.hide{
		display:none;
	}
</style>
</head>
<body>
	<h1>hideAd page</h1>
	<c:if test="${hide != 'on'}">
		<form action="/quiz13/hideAd" method="post" id="adForm">
			<h2>광고내용</h2>
			<h3>광고 24시간 보지 않기 <input type="checkbox" name="remember" value="on" id="chk_hide"></h3><br>
			<button type="submit">닫기</button>
		</form>
	</c:if>
	<h2>내용</h2>
	
	<script>
		const adForm = document.getElementById('adForm');
		const chkHide = document.getElementById('chk_hide')
		adForm.addEventListener('submit', (e)=>{
			e.preventDefault();
			
			if(chkHide.checked){
				adForm.submit();
			} else {
				adForm.classList.add('hide');
			}
		})
	</script>
</body>
</html>