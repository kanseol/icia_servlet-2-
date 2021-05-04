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
<h1>구구단 ${dan }단 출력</h1>
<ul>
	<c:forEach begin="1" end="9" var="val">
		<li>${dan}*${val }=${dan*val }</li>
	</c:forEach>
</ul>
</body>
</html>