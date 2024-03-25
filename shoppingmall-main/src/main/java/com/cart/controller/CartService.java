package com.cart.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.CartDAO;
import com.saeyan.dao.CartDAOe;
import com.saeyan.dto.CartDTO;
import com.user.contoller.action.Action;

public class CartService implements Action {
   private static CartDAO dao = new CartDAOe();
   
   
   public static List<CartDTO> selectAll(int userNo) throws Exception{
      return dao.selectAll(userNo);
   }
   
   
   public static int insert(int userNo, int productNo, int cartQty) throws Exception {
      int result = dao.insert(userNo, productNo, cartQty);
      return result;
   }
   
   public static int update(int cartNo, int cartQty) throws Exception {
      int result = dao.update(cartNo, cartQty);
      return result;
   }
   
   public static int delete(int cartNo ) throws Exception {
      int result = dao.delete(cartNo);
      return result;
   }


@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.getRequestDispatcher("cart.jsp").forward(request, response);

}
}
