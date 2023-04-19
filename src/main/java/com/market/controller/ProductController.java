package com.market.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.market.domain.ProductVO;
import com.market.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	ProductService service;
	
	// 상품 리스트
	@GetMapping
	public String getProdList(@RequestParam(value = "sort", required = false) String sort, Model model){
		logger.info("상품 페이지 호출");
		if(sort == null) sort="id";
		List<ProductVO> list = service.getProdList(sort);
		model.addAttribute("prodList", list);
		
		return "/product/prodList";
	}
	// 상품 리스트
	
}
