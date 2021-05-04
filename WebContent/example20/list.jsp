<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib uri="http://sargue.net/jsptags/time" prefix="javatime" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table class="table table-hover">
		<tr><th>번호</th><th>제목</th><th>시각</th><th>조회수</th></tr>
		<c:forEach items="${list }" var="post">
			<tr>
				<td>${post.pno }</td>
				<td><a href="/icia_servlet/example20/read?pno=${post.pno}">${post.title }</a></td>
				<td><javatime:format value="${post.writeTime}" style="MS" /></td>
				<td>${post.readCnt }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/icia_servlet/example20/write">글쓰기</a>
</body>
</html>