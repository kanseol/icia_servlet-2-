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
	<c:choose>
		<c:when test="${5+10==50}">
			<h3>5+10은 50이다.</h3>
		</c:when>
		<c:otherwise>
			<h3>5+10은 50이 아니다.</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>