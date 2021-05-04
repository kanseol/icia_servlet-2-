<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<form action="/icia_servlet/example18/update" method="post" id="loginForm">
	<div class="form-group">
    	<label for="name">이름:</label>
		<input type="text" class="form-control" id="name" name="name" value="${card.name }">
    </div>
    <div class="form-group">
    	<label for="password">전화:</label>
		<input type="text" class="form-control" id="tel" name="tel" value="${card.tel }">
    </div>
    <button class="btn btn-info">변경</button>&nbsp;&nbsp;&nbsp;&nbsp;			
</form>
</body>
</html>