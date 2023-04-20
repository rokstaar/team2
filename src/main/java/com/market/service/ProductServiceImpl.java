package com.market.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.domain.ProductVO;
import com.market.persistence.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	ProductDAO pdao;
	
	@Override
	public List<ProductVO> getProdList(String grade, String category, String title, String sort) {
		logger.info("service - 상품 목록 호출");
		Map<String, Object> map = new HashMap<>();
		map.put("grade", grade);
		map.put("category", category);
		map.put("title", title);
		map.put("sortBy", sort);
		return pdao.getProdList(map);
	}

	@Override
	public void likeProd(int pnum) {
		pdao.likeProd(pnum);
	}

	@Override
	public void likeProdCancel(int pnum) {
		pdao.likeProdCancel(pnum);
	}

	@Override
	public ProductVO getProdInfo(int pnum) {
		logger.info("service - 상품 정보 가져오기");
		return pdao.getProdInfo(pnum);
	}

	@Override
	public List<ProductVO> getRecProdList(String category) {
		return pdao.getRecProdList(category);
	}

}
