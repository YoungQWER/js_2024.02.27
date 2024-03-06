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
<%	//데이터를 보낼거라 executeUpdate (insert, update, delete)
	Connection con = null;
	PreparedStatement pstmt = null;  //동일하거나 비슷한 문을 높은 효율성으로 반복실행
	
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String username = "ezen";
	String password = "1234";
	String sql = "insert into item values(?, ?, ?)";  //데이터를 추출하고 조작하는 데에 사용
	
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");    //매개변수
	String price = request.getParameter("price");
	String description = request.getParameter("description");
	//System.out.println("name : " + name);
	//System.out.println("price : " + price);
	//System.out.println("description : " + description);
	
	try{
		//1. 드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. 데이터베이스 연결
		con = DriverManager.getConnection(url,username,password);
		
		//3. sql구문 전송
		pstmt = con.prepareStatement(sql);
		
		//4. 매핑.   String sql = "insert into item values(?, ?, ?)";
		pstmt.setString(1, name);
		pstmt.setInt(2, Integer.parseInt(price));
		pstmt.setString(3, description);
		
		//5. sql구문 실행
		int result = pstmt.executeUpdate();  //insert, update, delete (반환 타입은 int(행의 개수를 반환), ResultSet는 필요없다)
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