<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("username", "spring");
	session.setAttribute("alias", "summer");
	application.setAttribute("name", "홍길동");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${requestScope.username }<br>
	${sessionScope.alias }<br>
	${applicationScope.name }<br>
	<ul>
		<li>${username }</li>
		<li>${alias }</li>
		<li>${name }</li>
	</ul>
</body>
</html>