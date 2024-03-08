<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
 td{
 	border: 1px solid;black;
 	width: 200px;
 /* 	text-align: center; */
 }
</style>

<script type="text/javascript" src="script/employees.js"></script>
</head>
<body>
	<form action="login.do" method="post" name="frm">
		<table align="center">
			<tr>
				<td colspan="2" > 로그인</td>
			</tr>
			<tr>
				<td >아이디</td>
				<td><input type="text" name="id" value="${id}"></td>
			</tr>
			<tr>
				<td >비밀번호</td>
				<td><input type="password" name="pass" value="${pass}"></td>
			</tr>
			<tr>
				<td >레벨</td>
				<td><select name="admin" value="${lev}">
					<option value = "A">운영자</option>
					<option value = "B">일반회원</option>
				</select></td>
			</tr>
			<tr >
				<td colspan="2">
					<input type="submit" value="로그인" onclick="return loginCheck()">&nbsp;&nbsp;
					<input type="reset" value="취소">
				</td>
			</tr>			
		</table>
		<div  align="center"> ${message} </div>
	</form>
</body>
</html>