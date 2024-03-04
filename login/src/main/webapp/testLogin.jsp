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
	String id ="pinksung";
	String pwd ="1234";
	String name ="성윤정";
	
	if(id.equals(request.getParameter("id")) &&		//매개변수를 가져온다
			pwd.equals(request.getParameter("pwd"))){
		session.setAttribute("loginUser", name);	// 뒤에 앞의 속성을 추가
		response.sendRedirect("main.jsp");
	}else{
		response.sendRedirect("loginForm.jsp");
	}

%>
</body>
</html>