<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 마이페이지</h1>
	<p>아이디 : ${user.id}</p>
	<p>이름 : ${user.name}</p>
	<p>
		<a href="/main">메인페이지로 이동</a>
	</p>
	<button type="button" onclick="location.href='/customer/modifyPw' ">비밀번호 변경</button>
	
	<div>
		<h2>프로필 이미지</h2>
		<!-- <form action ="/customer/profiledto" method="post" enctype="multipart/form-data"> -->
		<form action ="/customer/profiledto" method="post" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${user.id}">
			<input type="hidden" name="name" value="${user.name}">
			<input type="file" name="profileImage">
			<button type="submit">등록하기</button>
		</form>
	</div>
	
	<p><img src="${fileInfo.urlFilePath}${fileInfo.fileName}"></p>
	<p>업로드시의 파일명 : ${fileInfo.originalFileName}</p>
	<p><a href="/attach/${fileInfo.fileName}">${fileInfo.originalFileName}</a> 파일 다운로드</p>
</body>
</html>