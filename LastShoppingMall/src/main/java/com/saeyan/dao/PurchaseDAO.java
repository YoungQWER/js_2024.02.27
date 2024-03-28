package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBManager;

public class PurchaseDAO {
    public void insert(int userNo, int productNo, int qty) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBManager.getConnection();
            String sql = "INSERT INTO PURCHASE (USER_NO, PRODUCT_NO, QTY) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userNo);
            pstmt.setInt(2, productNo);
            pstmt.setInt(3, qty);
            pstmt.executeUpdate();
        } finally {
            DBManager.close(conn, pstmt);
        }
    }
}