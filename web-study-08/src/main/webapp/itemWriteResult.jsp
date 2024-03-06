<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
<table width="800" border="1">
	<tr>
		<th>이름</th><th>가격</th><th>설명</th>	
	</tr>
<%  //데이터를 가져올때 executeQuery(select)
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection con = null;
	Statement stmt = null;
	
	ResultSet rs = null;   //executeQuery 사용
	
	String sql = "select * from item";	
	String username = "ezen";
	String password = "1234";
	
	
	try{
		//1. 드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. 데이터베이스 연결
		con = DriverManager.getConnection(url, username, password);
			
		//3. sql구문 전송 및 실행 결과를 rs참조
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);  //select 쿼리문 실행, ResultSet에 값을 저장
		
		while(rs.next()){
			out.println("<tr>");
			out.println("<td>"+ rs.getString("name")+"</td>");
			out.println("<td>"+ rs.getString("price")+"</td>");
			out.println("<td>"+ rs.getString("description")+"</td>");
			out.println("</tr>");
		}
		
	/*  while(rs.next()){
			out.println("<tr>");
			out.println("<td>"+ rs.getString(1)+"</td>");
			out.println("<td>"+ rs.getString(2)+"</td>");
			out.println("<td>"+ rs.getString(3)+"</td>");
			out.println("</tr>");
	*/
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs !=null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>

</table>
</body>
</html>