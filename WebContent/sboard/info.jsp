<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#user td {
		height: 60px;
		line-height: 60px;
	}
	
	#user td input {
		height: 25px;
	}
	
	#tel1, #tel2, #tel3 {
		width: 125px;
	}
	
	.first {
		background-color: #f3f3f3;
		text-align: center;
	}
	#profile_sajin {
		line-height: 25px;
	}
	.key {
		width: 35%;
		display: inline-block;
	}
</style>
</head>
<body>
	<table class="table table-hover" id="user">
		<tr>
			<td class="first">이름</td>
			<td><input type="text" id="irum" value="${user.irum}">&nbsp;</td>
		</tr>
		<tr>
			<td class="first">아이디</td><td colspan="2"><span id="username">${user.username }</span></td>
		</tr>
		<tr>
			<td class="first">가입일</td><td colspan="2"><span id="joinDate">${user.joinday}</span></td>
		</tr>
		<tr><td class="first">이메일</td>
			<td colspan="2">
				<input type="text" name="email" id="email" value="${user.email}">
		</td></tr>
	</table>
</body>
</html>