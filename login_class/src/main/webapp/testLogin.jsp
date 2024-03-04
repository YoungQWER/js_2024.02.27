<%@page import="unit01.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = "test";
	String pwd = "1234";
	String name = "홍길동";
	
	MemberVO member = new MemberVO();
	
	member.setId(id);
	member.setPwd(pwd);
	member.setName(name);
	
	if(id.equals(request.getParameter("id")) &&
			pwd.equals(request.getParameter("pwd"))){
		session.setAttribute("member", member);
		
		response.sendRedirect("main.jsp");
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>
</body>
</html>