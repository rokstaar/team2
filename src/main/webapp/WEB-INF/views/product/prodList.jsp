<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .custom-button {
    background: none;
    border: none;
    color: inherit;
    cursor: pointer;
    font-size: inherit;
    font-family: inherit;
  }

  .custom-button:focus {
    outline: none;
  }
</style>
</head>
<body>
	<h1>상품 페이지</h1>
	
	<table>
		<thead>
			<tr>
				<th>상품번호</th>
				<th>판매자</th>
				<th>분류</th>
				<th>제목</th>
				<th>내용</th>
				<th>가격</th>
				<th>상품상태</th>
				<th>사진</th>
				<th>조회수</th>
				<th>등록일자</th>
				<th>판매상황</th>
				<th>좋아요</th>
			</tr>
		</thead>
		<tbody>
	<c:forEach var="list" items="${prodList }">
		<tr>
			<td>
				<form action="/product/prodInfo" method="POST">
					<input type="hidden" name="product_num" value="${list.product_num}">
					<input type="hidden" name="seller" value="${list.product_seller}">
					<button type="submit" class="link-button">${list.product_num}</button>
				</form>
			</td>
			<td>${list.product_seller }</td>
			<td>${list.product_cate }</td>
			<td>${list.product_title }</td>
			<td>${list.product_content }</td>
			<td>${list.product_price }</td>
			<td>${list.product_grade }</td>
			<td>${list.product_pic }</td>
			<td>${list.product_readcount }</td>
			<td>${list.product_date }</td>
			<td>${list.product_status }</td>
			<td id="${list.product_num }">${list.product_favorite }</td>
		</tr>
		
	</c:forEach>
		</tbody>
	</table>
	
		<form id="prodRegForm" action="/product/prodReg" method="POST">
			<input type="hidden" name="product_num" value="1">
			<input type="hidden" name="id" value="itwill">
			<button type="button" class="custom-button" id="register">1번 유저로 상품 등록 페이지 가기</button>
		</form>
	

	
	<a href="/product/prodList?category=가전제품&sort=price_asc">누르시오</a>
	
	<button type="button" onclick="likeit(1);">누르면 찜</button>
	<button type="button" onclick="likecancel(1);">찜 취소하기</button>
	
	<a href="/product/prodInfo?product_num=1&seller=itwill">상세 페이지 가기</a>
	
	<script src="https://code.jquery.com/jquery-3.6.4.js" 
	integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
	<script>
	$('#register').on('click', function() {
		$('#prodRegForm').submit();
	});

	
	// 찜하기,취소 나중에 click 익명 함수로
	function likeit(pnum){
		$.ajax({
			type: "GET",
			url: "/product/likeProd",
			dataType: "text",
			data: {product_num : pnum},
			success: function(response){
				console.log("찜 목록");
			},
			error: function(req, stat, error){
				var obj = $('#'+pnum);
				obj.html(Number(obj.html())+1);
			}
		});
	}
	
	function likecancel(pnum){
		$.ajax({
			type: "GET",
			url: "/product/likeProdCancel",
			dataType: "text",
			data: {product_num : pnum},
			success: function(response){
				console.log("찜 목록");
			},
			error: function(req, stat, error){
				var obj = $('#'+pnum);
				obj.html(Number(obj.html())-1);
			}
		});
	}
	</script>
		
</body>
</html>