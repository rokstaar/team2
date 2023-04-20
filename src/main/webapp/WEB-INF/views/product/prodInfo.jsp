<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 상품 상세 페이지 </h1>
	
	${productVO }
	
	
	<hr>
	<h4> 이런 제품은 어떠세요? </h4>
	
	<div id="rec"></div>
	
	<script src="https://code.jquery.com/jquery-3.6.4.js" 
	integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
	<script type="text/javascript">
	$(document).ready(function () {
        var category = "your_category_here";
        $.ajax({
            type: "POST",
            url: "/product/recProd",
            dataType: "JSON",
            data: {
                category: "${productVO.product_cate}"
            },
            success: function (response) {
                console.log(response);
                
                var productHtml = '<ul>';
                for (var i = 0; i < response.length; i++) {
                    productHtml += '<li>' + response[i].product_num + '</li>';
                    productHtml += '<li>' + response[i].product_seller + '</li>';
                    productHtml += '<li>' + response[i].product_pic + '</li>';
                    productHtml += '<li>' + response[i].product_title + '</li>';
                    productHtml += '<li>' + response[i].product_content + '</li>';
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