<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/icia_servlet/sboard/write" method="post">
		<div class="form-group">
			<label for="title">제목:</label>
			<input type="text" class="form-control" id="title" name="title">
		</div>
		<div class="form-group">
			<textarea class="form-control" id="content" name="content"></textarea>
		</div>
		<button class="btn btn-success" id="write">작성</button>
	</form>
</body>
</html>