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
	public List<ProductVO> getProdList(String value) {
		logger.info("service - 상품 목록 호출");
		Map<String, Object> map = new HashMap<>();
		map.put("sortBy", value);
		return pdao.getProdList(map);
	}

}
