<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	Connection con = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String username = "ezen";
	String password = "1234";
	String sql = "insert into item values(?, ?, ?)";
	
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String description = request.getParameter("description");
	//System.out.println("name : " + name);
	//System.out.println("price : " + price);
	//System.out.println("nadescriptionme : " + description);
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection(url,username,password);
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, name);
		pstmt.setInt(2, Integer.parseInt(price));
		pstmt.setString(3, description);
		
		int result = pstmt.executeUpdate();
		
		System.out.println("저장 성공 : " + result);
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
%>
<h3>제품 등록 성공</h3>
<a href="itemWriteResult.jsp">아이템 목록 보기</a>
</body>
</html>