<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
	$(".delete").on("click", function(e) {
		e.preventDefault();
		var $form = $("<form>").attr("action","/icia_servlet/example18/delete").attr("method","post");
		$("<input>").attr("type", "hidden").attr("name","name").val($(this).attr("data-name")).appendTo($form);
		$form.appendTo($("body")).submit();
	});
});
</script>
</head>
<body>
<ul>
<c:forEach items="${cardList}" var="card">
		<li>${card } <a href="/icia_servlet/example18/update?name=${card.name}">변경하기</a>&nbsp;&nbsp;&nbsp;<a href="#" data-name="${card.name }" class="delete">카드 삭제</a></li>
</c:forEach>
</ul>
<a href="/icia_servlet/example18/write">카드 추가</a>
</body>
</html>