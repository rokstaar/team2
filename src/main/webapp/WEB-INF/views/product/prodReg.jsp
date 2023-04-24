<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 등록</h1>
	<form action="/product/regProduct" method="post" enctype="multipart/form-data">
		<input type="text" name="product_num" value="${product_num}">
		<input type="hidden" name="product_seller" value="${id }">
		분류
		<select name="product_cate">
			<option value="cloth">의류</option>
			<option value="homeapp">가전제품</option>
			<option value="furniture">식기,가구</option>
			<option value="elec">디지털,전자기기</option>
			<option value="food">식품,생필품</option>
			<option value="sport">스포츠,건강</option>
			<option value="mecha">기기,공구</option>
			<option value="book">도서,쿠폰</option>
			<option value="kid">유아</option>
			<option value="pet">애완동물</option>
			<option value="etc">기타</option>
		</select><br>
		제목 <input type="text" name="product_title"><br>
		내용 <input type="text" name="product_content"><br>
		가격 <input type="text" name="product_price"><br>
		물품상태<br>
		<input type="radio" name="product_grade" value="상">상
		<input type="radio" name="product_grade" value="중">중
		<input type="radio" name="product_grade" value="하">하<br>
		제품사진<input type="file" multiple="multiple" name="product_pic"><br>
		
		<input type="submit" value="등록하기">
	</form>
	
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
	
	

	</script>
</body>
</html>