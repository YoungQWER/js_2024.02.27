package com.user.contoller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dao.UserDAO;
import com.user.dto.UserVO;

public class UserLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserDAO uDao = UserDAO.getInstance();
		String url = "user/login.jsp";
		
		int result = uDao.idCheck(id, pwd);
		HttpSession session = request.getSession();
		
		UserVO vo = uDao.getUser(id);
		
	}

}
