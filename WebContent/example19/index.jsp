<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#logout").on("click", function() {
			var $form = $("<form>").attr("action","/icia_servlet/example19/logout").attr("method","post").appendTo("body");
			$form.submit();
		});
	});
</script>
</head>
<body>
	<c:if test="${username eq null }">
		<a href='/icia_servlet/example19/login'>로그인</a>
	</c:if>
	<c:if test="${username ne null }">
		${username }님 환영합니다 <button id='logout'>로그아웃</button>
	</c:if>
</body>
</html>