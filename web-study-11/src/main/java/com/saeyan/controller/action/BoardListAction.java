package com.saeyan.controller.action;
//게시글 전체 정보를 데이터베이스에서 얻어온다.

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardListAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/board/boardList.jsp";     				 //2. boardList.jsp >>
		
		BoardDAO bDao = BoardDAO.getInstance();
		List<BoardVO> list =bDao.selectAllBoards();
		
		request.setAttribute("boardList", list);
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}