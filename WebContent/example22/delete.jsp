<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/icia_servlet/guest_book/delete" method="post">
		비밀번호 : <input type="password" name="password"><br>
		<input type="hidden" name="gno" value="${gno }">
		<button>삭제</button>
	</form>
</body>
</html>