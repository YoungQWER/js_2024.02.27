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
		
		if(result  == 1) {
			
			session.setAttribute("id", vo);
			
			request.setAttribute("message", "로그인 성공했습니다.");
			url = "user/main.jsp";
		}else if(result == 0) {
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}else if(result == -1) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		}
		
		request.getRequestDispatcher(url)
			.forward(request, response);
	}

}
