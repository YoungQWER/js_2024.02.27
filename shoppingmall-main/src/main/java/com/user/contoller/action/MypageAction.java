package com.user.contoller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.dao.UserDAO;
import com.user.dto.AddressVO;

public class MypageAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 세션으로부터 userid 가져오기
        HttpSession session = request.getSession();
        String userid = (String) session.getAttribute("userid");

        // JSP에서 전송된 주소 정보 가져오기
        String username = request.getParameter("username"); // 추가된 부분
        String address = request.getParameter("address");
        String addressDetail = request.getParameter("addressDetail");
        String deliveryRequest = request.getParameter("deliveryRequest");

        // AddressVO 객체 생성 및 값 설정
        AddressVO vo = new AddressVO();
        vo.setUserid(userid);
        vo.setUsername(username); // 추가된 부분
        vo.setAddress(address);
        vo.setAddressDetail(addressDetail);
        vo.setDeliveryRequest(deliveryRequest);

        // DAO를 통해 데이터베이스에 주소 정보 저장
        UserDAO uDao = UserDAO.getInstance();
        int result = uDao.addressinsert(vo);

        // 결과에 따라 처리
        if (result == 1) {
            session.setAttribute("address", address);
            request.setAttribute("message", "마이페이지 등록했습니다.");
        } else {
            request.setAttribute("message", "마이페이지 등록에 실패했습니다.");
        }

        // 결과 페이지로 이동
        request.getRequestDispatcher("ShoppingServlet?command=product_list").forward(request, response);
    }
}
