package com.market.service;

import java.util.List;

import com.market.domain.ProductVO;

public interface ProductService {

	// 상품 리스트 가져오기
	public List<ProductVO> getProdList(String status, String category, String title, String sortvalue);
	
	// 해당 상품 찜하기
	public void likeProd(int pnum);
}
