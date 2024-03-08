package com.magic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

@WebServlet("/mypageUpdate.do")
public class MypageUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		EmployeesDAO mDao = EmployeesDAO.getInstance();
		
		EmployeesVO vo = mDao.getEmployees(id);
		HttpSession session = request.getSession();
		if(session != null){
			session.setAttribute("mVo", vo);
		}
		
		request.getRequestDispatcher("employees/mypageUpdate.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String lev = request.getParameter("lev");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		
		EmployeesVO vo = new EmployeesVO();
		vo.setId(id);
		vo.setPass(pass);
		vo.setName(name);
		vo.setLev(lev);
		vo.setGender(gender);
		vo.setPhone(phone);
		
		EmployeesDAO mDao = EmployeesDAO.getInstance();
		int result = mDao.updateEmployees(vo);
		
		response.sendRedirect("login.do");
	}

}
