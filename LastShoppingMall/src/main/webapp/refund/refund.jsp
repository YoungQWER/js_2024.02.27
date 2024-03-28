<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>환불 & 교환</title>
<script type="text/javascript" src="script/user.js"></script>
</head>
<body>
<h1>환불 & 교환</h1>
   <form action="CommandServlet" method="post" name="frm2" onsubmit="return refundCheck()">
    <input type="hidden" name="command" value="refund">
        <table border="1">
            <tr>
                <td>상품명</td>
                <td><input type="text" name="product" ></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="radio" name="check" value="0" checked="checked"> 환불 
                <input type="radio" name="check" value="1"> 교환</td>
            </tr>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="userid" ></td>
            </tr>
            <tr>
                <td>환불 계좌</td>
                <td><input type="text" name="account" ></td>
            </tr>
            <tr>
                <td>환불&교환 사유</td>
                <td><input type="text" name="reason" ></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="등록" onclick="showConfirmation()">
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="취소">
                </td>
            </tr>
        
        </table>
    </form>
    <script>
        function refundCheck() {
            console.log("refundCheck");

            if (document.frm2.product.value.length == 0) {
                alert("상품명을 입력해주세요");
                frm2.product.focus();
                return false;
            }
            if (document.frm2.userid.value.length == 0) {
                alert("아이디를 입력해주세요");
                frm2.userid.focus();
                return false;
            }
            if (document.frm2.account.value.length == 0) {
                alert("환불 계좌를 입력해주세요");
                frm2.account.focus();
                return false;
            }
            if (document.frm2.reason.value.length == 0) {
                alert("사유를 입력해주세요");
                frm2.reason.focus();
                return false;
            }
            return true;
        }

        function showConfirmation() {
            if (refundCheck()) {
                alert("환불 신청이 완료되었습니다.");
            }
        }
    </script>
</body>
</html>
