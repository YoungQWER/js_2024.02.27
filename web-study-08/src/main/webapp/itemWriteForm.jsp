<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정보 입력 폼</h1>

<form method="post" action="itemWrite.jsp">
	<tr>	
	<th>상품명<input type="text" name="name"><br></th>
	<th>가격<input type="text" name="price"><br></th>
	
	<th>설명 : <textarea rows="5" cols="30" name="description">
	</textarea></th>
	</tr>
	<input type="submit" value="전송">
	<input type="reset" value="취소">

</form>
</body>
</html>