<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
<script>
$(function() {
	if(location.search=="?error")
		alert("로그인에 실패했습니다");
	$("#login_btn").on("click", function() {
		if($("#username").val()=="") {
			$("#username_msg").text("아이디는 필수입력입니다").css("color","red");
			$("#username").focus();
			return;
		} else if($("#password").val()=="") {
			$("#password_msg").text("비밀번호는 필수입력입니다").css("color","red");
			$("#password").focus();
			return;
		} 
		$("#loginForm").submit();
	});
})
</script>
</head>
<body>
<form action="/icia_servlet/example19/login" method="post" id="loginForm">
	<div class="form-group">
    	<label for="username">아이디:</label>
    	<span id="username_msg"></span>
		<input type="text" class="form-control" id="username" name="username">
    </div>
    <div class="form-group">
    	<label for="password">Password:</label>
    	<span id="password_msg"></span>
		<input type="password" class="form-control" id="password" name="password">
    </div>
    <button type="button" id="login_btn" class="btn btn-info">로그인</button>&nbsp;&nbsp;&nbsp;&nbsp;
				
</form>
</body>
</html>