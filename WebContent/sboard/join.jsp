<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(function() {
		$("#join").on("click", function() {
			if($("#username").val()=="") {
				$("#username_msg").text("아이디는 필수입력입니다").css("color","red");
				$("#username").focus();
				return;
			} else if($("#irum").val()=="") {
				$("#irum_msg").text("이름은 필수입력입니다").css("color","red");
				$("#irum").focus();
				return;
			} else if($("#password").val()=="") {
				$("#password_msg").text("비밀번호는 필수입력입니다").css("color","red");
				$("#password").focus();
				return;
			} else if($("#password").val()!=$("#password2").val()) {
				$("#password2_msg").text("비밀번호가 일치하지 않습니다").css("color","red");
				$("#password2").text("").focus();
				return;
			} else if($("#email").val()=="") {
				$("#email_msg").text("이메일은 필수입력입니다").css("color","red");
				$("email").focus();
				return;
			}
			$("#joinForm").submit();
		});
	})
</script>
</head>
<body>
	<div id="wrap">
		<form id="joinForm" action="/icia_servlet/sboard/join" method="post" >
			<div>
				<label for="username">아이디</label>
				<span id="username_msg"></span>
				<div class="form-group">
					<input type="text" class="form-control" id="username" name="username">
				</div>
			</div>
			<div>
				<label for="irum">이름</label>
				<span id="irum_msg"></span>
				<div class="form-group">
					<input type="text" class="form-control" id="irum" name="irum">
				</div>
			</div>
			<div>
				<label for="password">비밀번호</label>
				<span id="password_msg"></span>
				<div class="form-group">
					<input id="password" type="password" class="form-control" name="password">
				</div>
			</div>
			<div>
				<label for="password2">비밀번호 확인</label>
				<span id="password2_msg"></span>
				<div class="form-group">
					<input id="password2" type="password" class="form-control">
				</div>	
			</div>
			<div>
				<label for="email">이메일</label>
				<span id="email_msg"></span>
				<div class="form-group">
					<input id="email" type="text" name="email" class="form-control">
				</div>
			</div>
			<div class="form-group" style="text-align: center;">
				<button type="button" id="join" class="btn btn-info">가입</button>&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" id="home" class="btn btn-primary">HOME</button>
			</div>
		</form>
	</div>
</body>
</html>