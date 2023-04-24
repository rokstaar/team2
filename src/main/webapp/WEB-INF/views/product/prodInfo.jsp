<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 상품 상세 페이지 </h1>
	
	
	
	게시글 제목 : ${info.product_title }<br>
	상품 이미지 : ${info.product_pic }<br>
	프로필 사진 : ${info.member_pic }<br>
	판매자 닉네임 : ${info.member_nickname }<br>
	상품 가격 : ${info.product_price }<br>
	판매자 지역 : ${info.member_address }<br>
	상품 상태 : ${info.product_grade }<br>
	작성 시간 : ${info.product_date }<br>
	분류 : ${info.product_cate }<br>
	판매글 : ${info.product_content }<br>
	판매자 온도 : ${score }<br>
	<br>
	<img src="/resources/images/score_good.png">
	
	<br>
	<br>
	
	<c:forEach var="pics" items="${productVO.product_pic.split(',')}">
		<%-- <img src="/resources/images/${pics }" style="width:200px;"> --%>
		<img src="/resources/images/default1.jpg" style="width:200px;">
	</c:forEach>

	
	<button>판매자와 채팅하기</button>
	
	
	<hr>
	<h4> 이런 제품은 어떠세요? </h4>
	
	<div id="rec"></div>
	
	<script src="https://code.jquery.com/jquery-3.6.4.js" 
	integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	$(document).ready(function() {
        var category = "";
        $.ajax({
        	type: "POST",
        	url: "/product/recProd",
            dataType: "JSON",
            data: {
                category: "${info.product_cate}"
            },
            success: function (response) {
                console.log(response);
                
                var productHtml = '<ul>';
                for (var i = 0; i < response.length; i++) {
                	if(response[i].product_num != ${info.product_num}){
	                    productHtml += '<li>' + response[i].product_num + '</li>';
	                    productHtml += '<li>' + response[i].product_seller + '</li>';
	                    productHtml += '<li>' + response[i].product_pic + '</li>';
	                    productHtml += '<li>' + response[i].product_title + '</li>';
	                    productHtml += '<li>' + response[i].product_content + '</li>';
                	}
                }
                productHtml += '</ul>';

                $('#rec').html(productHtml);
            },
            error: function (req, stat, error) {
                console.log(req + " - 에러발생 - " + error);
            }
        });
    });
	</script>
</body>
</html>