package com.market.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.domain.ProductVO;
import com.market.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	ProductService service;
	
	// 상품 리스트
	@GetMapping(value = "/prodList")
	public String getProdList(@RequestParam(value = "sort", defaultValue="") String sort, 
			@RequestParam(value = "status", required = false) String status,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "title", required = false) String title,
			Model model){
		logger.info("상품 페이지 호출 {}", sort);
		List<ProductVO> list = service.getProdList(status, category, title, sort);
		model.addAttribute("prodList", list);
		
		return "/product/prodList";
	}
	// 상품 리스트
	
	// 상품 찜하기
	@GetMapping(value = "/likeProd")
	public void likeProd(@RequestParam(value = "product_num") int pnum) {
		service.likeProd(pnum);
	}
	// 상품 찜하기
	
	// 상품 찜취소하기
	@GetMapping(value = "/likeProdCancel")
	public void likeProdCancel(@RequestParam(value = "product_num") int pnum) {
		service.likeProdCancel(pnum);
	}
	// 상품 찜취소하기
	
	// 상품 정보 가져오기
	@GetMapping(value = "/prodInfo")
	public void getProdInfo(@RequestParam(value = "product_num") int pnum
			, Model model) {
		logger.info("상품 정보 가져오기!");
		model.addAttribute(service.getProdInfo(pnum));
	}
	// 상품 정보 가져오기
	
	// 같은 종류의 추천 상품 가져오기
	@PostMapping(value = "/recProd")
	@ResponseBody
	public List<ProductVO> recProd(@RequestParam(value = "category") String category
			, Model model) {
		logger.info("추천 상품 가져오기 : {}", service.getRecProdList(category));
		return service.getRecProdList(category);
	}
	// 같은 종류의 추천 상품 가져오기
}
