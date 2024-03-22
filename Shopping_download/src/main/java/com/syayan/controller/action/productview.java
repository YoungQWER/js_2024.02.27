package com.syayan.controller.action;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.controller.ShoppingServlet;
import com.seayan.dao.ShoppingDAO;
import com.seayan.dto.ShoppingVO;

import oracle.jdbc.rowset.OracleCachedRowSetWriter;

public class productview implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("text/html; charset=utf-8");
		
    String productName = request.getParameter("productName");
	
	ShoppingVO vo = ShoppingDAO.getInstance().selectOneByName(productName);
	
	request.setAttribute(productName, vo);
	
	String url = "Shopping/productview.jsp";
	
	request.getRequestDispatcher(url).forward(request, response);
	
	}

}
