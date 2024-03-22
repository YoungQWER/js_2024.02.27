<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<title>Insert title here</title>
</head>
<body>
<div id="wrap" align="center">
      <h1>공지사항 등록</h1>
      <form name="frm" method="post" action="ShoppingServlet">
         <input type="hidden" name="command" value="admin_notion_form">
         <table>
            <tr>
               <th>관리자 아이디</th>
               <td><input type="text" name="adminId"> * 필수</td>
            </tr>
            <tr>
               <th>제목</th>
               <td><input type="text" name="title"> * 필수 </td>
            </tr>
            <tr>
               <th>작성자</th>
               <td><input type="text" name="writer"> * 필수</td>
            </tr>
            <tr>
               <th>이미지</th>
               <td><input type="file" name="img"></td>
            </tr>
            <tr>
               <th>내용</th>
               <td><textarea cols="70" rows="15" name="content"></textarea></td>
            </tr>
         </table>
         <br>
         <br> <input type="submit" value="등록" > 
              <input type="reset" value="다시 작성">
              <input type="button" value="목록" onclick="location.href='ShoppingServlet?command=Admin_Notion'">
      </form>
   </div>
</body>
</html>