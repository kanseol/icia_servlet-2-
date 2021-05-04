<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.guestBook {
		border: 1px solid skyblue;
	}
</style>
</head>
<body>
<c:forEach items="${list }" var="guestBook">
	<div class="guestBook">
		<div>${guestBook.nickname }&nbsp;&nbsp;&nbsp;${guestBook.writeTime }</div>
		<div>${guestBook.content }</div>
		<div><a href="/icia_servlet/guest_book/delete?gno=${guestBook.gno }">삭제</a></div>
	</div>
</c:forEach>
</body>
</html>