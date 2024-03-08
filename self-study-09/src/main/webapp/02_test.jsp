<%@page import="com.magic.dao.EmployeesDAO"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	EmployeesDAO memDao = EmployeesDAO.getInstance();

	Connection con = memDao.getConnection();
	
	out.println("DB연결 성공 : " + con);
%>