<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="/icia_servlet/example14/calc" method="post">
	<div class="form-group">
    	<label for="val1">값 1:</label>
		<input type="text" class="form-control" id="val1" name="val1">
    </div>
    <div class="form-group">
    	<label for="val2">값 2:</label>
		<input type="text" class="form-control" id="val2" name="val2">
    </div>
    <div class="form-group">
    	<label for="operator">연산:</label>
		<select class="form-control" id="operator" name="operator">
      		<option>+</option>
      		<option>-</option>
      		<option>*</option>
    	</select>
    </div>
    <button class="btn btn-primary">더하기</button>
</form>
</body>
</html>