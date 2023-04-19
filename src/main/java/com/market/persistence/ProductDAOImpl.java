package com.market.persistence;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.market.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	@Autowired
	private SqlSession session;
	private final String NAMESPACE = "com.itwillbs.mapper.ProductMapper";

	// 상품 리스트
	@Override
	public List<ProductVO> getProdList(Map<String, Object> map) {
		logger.info("DAO - 상품 리스트 호출 {}", map);
		return session.selectList(NAMESPACE + ".getProdList", map);
	}

	// 찜하기
	@Override
	public void likeProd(int product_num) {
		session.update(NAMESPACE + ".likeProd", product_num);
	}
	
	
}
