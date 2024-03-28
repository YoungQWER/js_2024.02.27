<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>메인</h1>
<h1>${userid}님</h1>

<form action="CommandServlet" method="post">
    <input type="hidden" name="command" value="mypage_form">
    <input type="submit" value="마이페이지">
</form>
<form action="CommandServlet" method="post">
    <input type="hidden" name="command" value="refund_form">
    <input type="submit" value="교환&환불">
</form>
<form action="ShoppingServlet" method="post">
    <input type="hidden" name="command" value="product_list">
    <input type="submit" value="상품페이지">
</form>




</body>
</html>


