package com.user.contoller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // MainAction에서는 직접적인 작업이 없으므로 바로 main.jsp로 포워딩합니다.
        request.getRequestDispatcher("user/main.jsp").forward(request, response);
    }

}
