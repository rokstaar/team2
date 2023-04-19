package com.market.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.market.domain.MemberVO;
import com.market.service.MemberService;
import com.market.service.TradeService;

@Controller
@RequestMapping(value = "/trade")
public class TradeController {
	
	

	@Inject
	private TradeService service;

	private static final Logger logger = LoggerFactory.getLogger(TradeController.class);
	
	//http://localhost:8080/main
	
	
	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public String tradeReview() {
		
		
		return "/trade/tradeReview";
	}
	
	@RequestMapping(value = "/buyReview", method = RequestMethod.GET)
	public String buyReview() {
		
		
		return "/trade/buyReview";
	}

}
