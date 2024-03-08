<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="employees.js"></script>
<style type="text/css">
 td{
 	border: 1px solid black;
 	width: 200px;
 	text-align: center;
 }
  table.mainmenu td.login:HOVER{
    background-color: pink;
 }
</style>
</head>
<body>
	<form action="/mypageUpdate.do" method="post" name="frm">
		<table align="center" >
		
		
			<tr>
				<td colspan="2" > ${mVo} 마이페이지</td>
			</tr>
			<tr>
				<td >아이디</td>
				<td><input type="text" name="id" value="${mVo.id}"></td>
			</tr>
			<tr>
				<td >비밀번호</td>
				<td><input type="password" name="pass" value="${mVo.pass}"></td>
			</tr>
			<tr>
				<td >이름</td>
				<td><input type="text" name="name" value="${mVo.name}"></td>
			</tr>
			<tr>
				<td >권한</td>
				<td><select name="admin" value="${mVo.lev}">
						<option value = "A">운영자</option>
						<option value = "B">일반회원</option>
					</select></td>
			<tr>
				<td >성별</td>
				<td><input type="text" name="gender" value="${mVo.gender}"></td>
			</tr>
			<tr>
				<td >전화번호</td>
				<td><input type="text" name="phone" value="${mVo.phone}"></td>
			</tr>

			<tr>
				<td colspan="2">
					<input type="submit" value="수정" onclick="return loginCheck()">&nbsp;&nbsp;
					<input type="reset" value="취소">
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>