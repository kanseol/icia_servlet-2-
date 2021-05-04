<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<%@ taglib uri="http://sargue.net/jsptags/time" prefix="javatime" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(function() {
	$("#delete").on("click", function() {
		alert($("#delete").attr("data-pno"));
		var $form = $("<form>").attr("action", "/icia_servlet/sboard/delete").attr("method","post");
		$("<input>").attr("type","hidden").attr("name","pno").val($("#delete").attr("data-pno")).appendTo($form);
		$form.appendTo($("body")).submit();
	});
})
</script>
</head>
<body>
	<table class="table">
		<tr><td>${post.pno }</td></tr>
		<tr><td>${post.title }</td></tr>
		<tr><td>${post.content }</td></tr>
		<tr><td><javatime:format value="${post.writeTime}" style="MS" /></td></tr>
		<tr><td>${post.readCnt }</td></tr>
	</table>
	<c:if test="${username eq post.writer}">
		<div>
			<button id="delete" data-pno="${post.pno}">삭제</button>
		</div>
	</c:if>
</body>
</html>