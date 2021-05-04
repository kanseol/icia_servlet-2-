<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(function() {
		$("#nav").on("click", "#logout_btn", function(e) {
			e.preventDefault();
			var $form = $("<form>").attr("action","/icia_servlet/sboard/logout").attr("method","post");
			$form.appendTo($("body")).submit();
		})
	});
</script>
</head>
<body>
	<div id="nav" class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/icia_servlet/sboard/main">ICIA</a>
			</div>
			<ul class="nav navbar-nav" id="menu_parent">
				<li><a href="/icia_servlet/sboard/list">게시판으로</a></li>
				<c:if test="${username eq null }">
					<li><a href="/icia_servlet/sboard/join">회원가입</a></li>
					<li><a id='login' href='/icia_servlet/sboard/login'>로그인</a></li>
				</c:if>
				<c:if test="${username ne null }">
					<li><a href="/icia_servlet/sboard/info">내정보 보기</a></li>
					<li><a href='/icia_servlet/sboard/write'>글쓰기</a></li>
					<li><a id="logout_btn" href="#">로그아웃</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</body>
</html>