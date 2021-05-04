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
	<c:if test="${username eq null }">
		게스트이십니다
	</c:if>
	<c:if test="${username ne null }">
		${username }님 환영합니다
	</c:if>
</body>
</html>