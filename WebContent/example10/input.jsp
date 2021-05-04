<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<form action="/icia_servlet/example10/test" method="post">
	<div class="form-group">
    	<label for="username">아이디:</label>
		<input type="text" class="form-control" id="username" name="username">
    </div>
    <div class="form-group">
    	<label for="password">비밀번호:</label>
		<input type="password" class="form-control" id="password" name="password">
    </div>
    	<div class="form-group">
    	<label for="name">이름:</label>
		<input type="text" class="form-control" id="name" name="name">
    </div>
    <div class="form-group">
    	<label for="email">이메일:</label>
		<input type="text" class="form-control" id="email" name="email">
    </div>
	<div class="form-group">
    	<label for="birthday">생일:</label>
		<input type="date" class="form-control" id="birthday" name="birthday">
    </div>
	<button class="btn btn-info">회원가입</button>
</form>
</body>
</html>