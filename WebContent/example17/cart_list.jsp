<%@page import="java.util.List"%>
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
	<c:forEach items="${cart}" var="product">
		<li>${product }</li>
	</c:forEach>
	</ul>
<a href="/icia_servlet/example17/product_list">제품 목록으로</a>
</body>
</html>

