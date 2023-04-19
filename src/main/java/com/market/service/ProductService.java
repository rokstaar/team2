package com.market.service;

import java.util.List;

import com.market.domain.ProductVO;

public interface ProductService {

	public List<ProductVO> getProdList(String value);
}
