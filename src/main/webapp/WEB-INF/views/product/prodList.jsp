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
	
	<form>
		<select name="sort" id="sort-select">
			<option value="" hidden>===정렬===</option>
			<option value="">전체</option>
			<option value="price_asc">가격 낮은 순</option>
			<option value="price_desc">가격 높은 순</option>
			<option value="date_asc">최근일자 순</option>
			<option value="date_desc">예전일자 순</option>
		</select>
		<select name="grade" id="grade-select">
			<option value="" hidden>==상품상태==</option>
			<option value="">전체</option>
			<option value="상">상</option>
			<option value="중">중</option>
			<option value="하">하</option>
		</select>
		<select name="category" id="category-select">
			<option value="" hidden>====분류====</option>
			<option value="">전체</option>
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
		</select>
		<input type="text" name="title">
		<input type="submit" value="검색하기">
	</form>
	
	
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
	

	<br>
	
	
	
	<button type="button" onclick="likeit(1);">누르면 찜</button>
	<button type="button" onclick="likecancel(1);">찜 취소하기</button>
	
	<a href="/product/prodInfo?product_num=1&seller=itwill">상세 페이지 가기</a>
	
	<script src="https://code.jquery.com/jquery-3.6.4.js" 
	integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
	<script>
	$('#register').on('click', function() {
		$('#prodRegForm').submit();
	});

	
	$(document).ready(function() {
	    const urlParams = new URLSearchParams(window.location.search);
	    const sortValue = urlParams.get('sort');
	    const gradeValue = urlParams.get('grade');
	    const categoryValue = urlParams.get('category');

	    if (sortValue) {
	    	$('#sort-select').val(sortValue);
	    }
	    if (gradeValue) {
	    	$('#grade-select').val(gradeValue);
	    }
	    if (categoryValue) {
	    	$('#category-select').val(categoryValue);
	    }
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