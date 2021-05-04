<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>당신의 아이디 : ${user.username }</li>
		<li>당신의 이름 : ${user.name }</li>
		<li>당신의 비밀번호 : ${user.password }</li>
		<li>당신의 이메일 : ${user.email }</li>
		<li>당신의 생일 : ${user.birthday }</li>
		<li>당신의 레벨 : ${user.level }</li>
	</ul>
</body>
</html>