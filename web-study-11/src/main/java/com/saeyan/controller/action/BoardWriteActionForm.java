package com.saeyan.controller.action;
//새로운 게시글 정보를 입력받기 위한 게시글 등록 페이지로 이동하도록 한다.

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardWriteActionForm implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.getRequestDispatcher("board/boardWrite.jsp").forward(request, response);
		
		
	}

}
