package com.market.persistence;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.ProductVO;

public interface AdminDAO {
	
	// 모든 회원목록정보 조회
	public List<MemberVO> getMemebrList() throws Exception;
	
	// 모든 상품목록정보 조회
	public List<ProductVO> getProductList() throws Exception;

}
