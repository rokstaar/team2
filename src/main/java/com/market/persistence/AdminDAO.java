package com.market.persistence;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.ProductVO;

public interface AdminDAO {
	
	// ��� ȸ��������� ��ȸ
	public List<MemberVO> getMemebrList() throws Exception;
	
	// ��� ��ǰ������� ��ȸ
	public List<ProductVO> getProductList() throws Exception;

}
