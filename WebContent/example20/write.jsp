<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#textarea { width: 600px; height: 600px;}
</style>
</head>
<body>
	<form action="/icia_servlet/example20/write" method="post">
		제목 : <input type="text" name="title"><br>
		<textarea name="content" id="textarea"></textarea>
		<button>작성</button>
	</form>
</body>
</html>