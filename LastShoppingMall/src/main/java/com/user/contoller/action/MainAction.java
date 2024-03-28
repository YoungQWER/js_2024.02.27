package com.user.contoller.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.jdbc.Driver");
            
            // 데이터베이스 연결
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            
            // 쿼리 작성 및 실행
            String query = "SELECT * FROM user_table";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            // 결과 처리
            while (rs.next()) {
                // 여기에서 필요한 데이터를 가져와서 request에 설정
                String userData = rs.getString("user_data_column_name");
                request.setAttribute("userData", userData);
            }
            
            // main.html로 포워딩
            request.getRequestDispatcher("main.html").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // 예외 처리
            // 필요에 따라 예외 처리 코드를 추가하세요.
        } finally {
            // 리소스 해제
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
