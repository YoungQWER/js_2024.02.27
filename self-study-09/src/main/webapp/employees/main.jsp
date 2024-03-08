<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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

<form action="logout.do" method="get">
 	<table class="mainmenu" align="center">
			<tr>
				<td> <label name="home">${loginUser.name}님 반갑습니다.</label></td>
				<td> <label name="home">레벨 : ${loginUser.lev}</label></td>
				 <td class="login"> <a href="logout.do" style="text-decoration: none;">로그아웃</a></td>
					<c:choose>
						<c:when test="${result==2}">
							 <td class="login"> <a href="custom.do" style="text-decoration: none;">사용자등록</a></td>
						</c:when>
						<c:when test="${result==3}">
							 <td style="width:300px">사용자등록
							 <span style="color:red">(관리자로 로그인 후 사용 가능)</span></td>
						</c:when>
					</c:choose>
				<td class="login">
				  <a href="mypageUpdate.do" style="text-decoration: none;">마이페이지</a></td>
			</tr>		
	</table> 
</form>
</body>
</html>