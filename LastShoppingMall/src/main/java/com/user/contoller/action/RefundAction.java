package com.user.contoller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RefundAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 등록이 완료되었음을 나타내는 메시지를 세션에 저장합니다.
        HttpSession session = request.getSession();
        session.setAttribute("message", "환불 신청이 완료되었습니다.");

        // 메인 페이지로 리다이렉트합니다.
        response.sendRedirect("CommandServlet?command=main");
    }

}
