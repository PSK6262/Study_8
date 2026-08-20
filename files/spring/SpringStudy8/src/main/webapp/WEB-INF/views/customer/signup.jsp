<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="" method="post">
		<label>사용자 아이디 &nbsp;<input type="text" name="id" id="inputId"></label>
		<button type="button" id="btn_checkDupId">중복체크</button><br>
		<button type="button" id="btn_checkDupIdJson">중복체크Json</button><br>
		<p id="checkDupIdMsg"></p>
		
		<label>사용자 비번 &nbsp;<input type="password" name="pw"></label><br>
		<label>사용자 이름 &nbsp;<input type="text" name="name"></label><br>
		<button type="submit">계정생성</button>
	</form>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/4.0.0/jquery.min.js" integrity="sha512-8LENNbXmzI/Gbj+OwXmqR6V4QaUAw0/porPzy1+dQoJqC0JPHedWoe0DDOTL2uHA5XXJyIsPtiMHH86pVlay6A==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script>
		//중복체크 버튼을 클릭 -> input태그에 입력한 아이디 값 확인 -> 서버로 ajax 요청 ( 아이디 담아서 ) -> 서버에서 중복체크 확인
		// -> 결과 응답 -> (클라이언트) 응답 값 확인 -> 화면에 표시
		
		const btn_checkDupId = document.getElementById("btn_checkDupId");
		const p_checkDupIdMsg = document.getElementById("checkDupIdMsg");
		
		btn_checkDupId.addEventListener("click",()=>{
			//중복체크로직
			let inputId = document.getElementById('inputId').value;
			console.log(inputId);
			
			
			//1. 단순 텍스트로 id요청 -> 응답 단순 Y/N
			$.ajax({
				type: "POST",
				url: "http://localhost:8080/customer/checkDupId",
				headers : {
					"Content-type":"application/json"
				},
				data : inputId, // 서버에 보낼 데이터 (parameter)
				dataType: "text",
				success: function(result){
					console.log("ajax success");
					console.log(result);
					
					if(result == 'Y'){
						p_checkDupIdMsg.textContent = "중복된 아이디입니다.";
						p_checkDupIdMsg.style.color = "red";
					} else {
						p_checkDupIdMsg.textContent = "사용 가능한 아이디입니다.";
						p_checkDupIdMsg.style.color = "green";
					}
				},
				error: function(error){
					console.log(error);
					console.log(result);
				}
			})
		});
			
		const btn_checkDupIdJson = document.getElementById("btn_checkDupIdJson");
		
		btn_checkDupIdJson.addEventListener("click", ()=>{
			//중복체크로직
			let inputId = document.getElementById('inputId').value;
			console.log(inputId);
			//2. Json format 송수신 // 왔다갔다
			// JSON format text => js obj JSON.stringify
			// js obj => JSON format text JSON.parse
			
			let obj = {
				"id":inputId ,
				"type":"CUS"
			};
		
			let jsonText = JSON.stringify(obj);
		
			$.ajax({
				type: "POST",
				url: "http://localhost:8080/customer/checkDupIdJson",
				headers : {
					"Content-type":"application/json"
				},
				data : jsonText, // 서버에 보낼 데이터 (parameter)
				dataType: "json",
				//dataType: "text",
				success: function(result){
					console.log("ajax success");
					console.log(result);
					// dataType : text => text로 인식 (json format의 text)
					// text -> json 변환 (parsing)
					/* let jsObj = JSON.parse(result);
					console.log(jsObj.header.resultCode);
					console.log(jsObj.header.resultMessage);
					 console.log(jsObj.body);*/
					//if(jsObj.body == 'Y')...
					// dataType : json => (javascript object 변환) -> result 주입
					let jsObj = result;
					
					if(jsObj.body == 'Y'){
						p_checkDupIdMsg.textContent = "중복된 아이디입니다.";
						p_checkDupIdMsg.style.color = "red";
					} else {
						p_checkDupIdMsg.textContent = "사용 가능한 아이디입니다.";
						p_checkDupIdMsg.style.color = "green";
					}
				},
				error: function(error){
					console.log(error);
				}
			})
		});
	</script>
</body>
</html>