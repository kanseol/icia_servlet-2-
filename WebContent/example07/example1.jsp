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
	<c:if test="${5<10}">
		<h3>5는 10보다 작다.</h3>
	</c:if>
	<c:if test="${10<5}">
		<h3>10은 5보다 작다.</h3>
	</c:if>
	<c:if test="${6+3==9}">
		<h3>6 + 3 은 9이다.</h3>
	</c:if>
</body>
</html>