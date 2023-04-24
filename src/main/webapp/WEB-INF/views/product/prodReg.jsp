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
		<input type="text" name="product_seller" value="${id }">
		분류
		<select name="product_cate">
			<option value="의류">의류</option>
			<option value="가전제품">가전제품</option>
			<option value="식기,가구">식기,가구</option>
			<option value="디지털,전자기기">디지털,전자기기</option>
			<option value="식품,생필품">식품,생필품</option>
			<option value="스포츠,건강">스포츠,건강</option>
			<option value="기기,공구">기기,공구</option>
			<option value="도서,쿠폰">도서,쿠폰</option>
			<option value="유아">유아</option>
			<option value="애완동물">애완동물</option>
			<option value="기타">기타</option>
		</select><br>
		제목 <input type="text" name="product_title"><br>
		내용 <input type="text" name="product_content"><br>
		가격 <input type="text" name="product_price"><br>
		물품상태<br>
		<input type="radio" name="product_grade" value="상">상
		<input type="radio" name="product_grade" value="중">중
		<input type="radio" name="product_grade" value="하">하<br>
		
		<div id="file-inputs-container">
			<div class="file-input-wrapper">
				제품사진<input type="file" name="product_pics">
				<button type="button" class="add-button">+</button>
			</div>
		</div>
		
		<input type="submit" value="등록하기">
	</form>
	
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
	
	document.addEventListener('DOMContentLoaded', function () {
		let fileInputCounter = 1;

		document.querySelector('#file-inputs-container').addEventListener('click', function (event) {
			if (event.target.classList.contains('add-button') && fileInputCounter < 3) {
				const newFileInputWrapper = document.createElement('div');
		  		newFileInputWrapper.classList.add('file-input-wrapper');

	    		const newFileInput = document.createElement('input');
		    	newFileInput.type = 'file';
		    	newFileInput.name = 'product_pics';

		    	const newButton = document.createElement('button');
		    	newButton.type = 'button';
		    	newButton.classList.add('add-button');
		    	newButton.textContent = '+';

		    	newFileInputWrapper.appendChild(newFileInput);
		    	newFileInputWrapper.appendChild(newButton);

		    	document.querySelector('#file-inputs-container').appendChild(newFileInputWrapper);

		    	fileInputCounter++;
			}
		});
	});


	</script>
</body>
</html>