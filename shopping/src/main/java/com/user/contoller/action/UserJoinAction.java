package com.user.contoller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dao.UserDAO;
import com.user.dto.UserVO;

public class UserJoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		int jumin = Integer.parseInt(request.getParameter("jumin"));
		String nickname = request.getParameter("nickname");
		String admincheck = request.getParameter("admincheck");
 		
		UserVO vo = new UserVO();
		

		vo.setId(id);
		vo.setPwd(pwd);
		vo.setUsername(username);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setJumin(jumin);
		vo.setNickname(nickname);
		vo.setAdmincheck(admincheck);		
		
		UserDAO uDao = UserDAO.getInstance();
		int result = uDao.join(vo);
		
		HttpSession session = request.getSession();
		
		if(result == 1) {
			session.setAttribute("id", id);
			request.setAttribute("message", "회원가입에 성공했습니다.");
		}else {
			request.setAttribute("message", "회원가입에 실패했습니다.");
		}
	
		request.getRequestDispatcher("user/login.jsp")
			.forward(request, response);
		
	}

}
