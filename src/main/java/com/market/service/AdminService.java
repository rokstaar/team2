package com.market.service;

import java.util.List;

import com.market.domain.MemberVO;
import com.market.domain.ProductVO;

public interface AdminService {
	
	// ȸ����ü��� ��ȸ
	public List<MemberVO> memberList() throws Exception;
	
	// ��ǰ��ü��� ��ȸ
	public List<ProductVO> productList() throws Exception;

}
