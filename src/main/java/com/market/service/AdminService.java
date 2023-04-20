package com.market.service;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.ProductVO;

public interface AdminService {
	
	// 회원전체목록 조회
	public List<MemberVO> memberList() throws Exception;
	
	// 상품전체목록 조회
	public List<ProductVO> productList() throws Exception;

}
