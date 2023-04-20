package com.market.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.market.domain.MemberVO;
import com.market.domain.ProductVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	
	private static final Logger logger 
	      = LoggerFactory.getLogger(AdminDAOImpl.class);
	
	@Inject
	private SqlSession sqlSession;

	// mapper-namespace�� ����� ����
	private static final String NAMESPACE 
	     = "com.itwillbs.mapper.adminMapper";

	@Override
	public List<MemberVO> getMemebrList() throws Exception {
		List<MemberVO> memberList = sqlSession.selectList(NAMESPACE+".getMemberList");
		
		return memberList;
	}

	@Override
	public List<ProductVO> getProductList() throws Exception {
        List<ProductVO> productList = sqlSession.selectList(NAMESPACE+".getProductList");
		
        return productList;
	}
	
	


}
