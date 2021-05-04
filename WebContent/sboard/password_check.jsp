<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<script>
$(function() {
	$("#password_check_btn").on("click", function() {
		if($("#password").val()=="") {
			$("#password_msg").text("비밀번호는 필수입력입니다").css("color","red");
			$("#password").focus();
			return;
		} 
		$("#passwordCheckForm").submit();
	});
})
</script>
</head>
<body>
<form action="/icia_servlet/sboard/password_check" method="post" id="passwordCheckForm">
    <div class="form-group">
    	<label for="password">Password:</label>
    	<span id="password_msg"></span>
		<input type="password" class="form-control" id="password" name="password">
    </div>
    <button type="button" id="password_check_btn" class="btn btn-info">비밀번호 확인</button>&nbsp;&nbsp;&nbsp;&nbsp;
				
</form>
</body>
</html>