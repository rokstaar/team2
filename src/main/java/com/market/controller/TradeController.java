package com.market.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.domain.MemberVO;
import com.market.domain.TradeVO;
import com.market.service.TradeService;

@Controller
@RequestMapping(value = "/trade")
public class TradeController {
	
	

	@Inject
	private TradeService service;

	private static final Logger logger = LoggerFactory.getLogger(TradeController.class);
	
	//http://localhost:8080/main
	
	
	@RequestMapping(value = "/review", method = RequestMethod.GET) 
	public String tradeReview(Model model,HttpSession session) throws Exception {
		String id = (String)session.getAttribute("id");
		
		List<TradeVO> tBuyReview = service.getBuyReview();
		model.addAttribute("tBuyReview",tBuyReview);	
		logger.info(tBuyReview+"@@@@@@@@@@@@@@@@@@@@");
		
		return "/trade/tradeReview";
	}
	
	@RequestMapping(value = "/buyReview", method = RequestMethod.GET)
	public String buyReview(Model model) throws Exception {
		
		List<TradeVO> getBuyReview = service.getBuyReview();
		model.addAttribute("getBuyReview",getBuyReview);	
		logger.info(getBuyReview+"@@@@@@@@@@@@@@@@@@@@");
		
		
		return "/trade/buyReview";
	}
	
	
	@RequestMapping(value = "/sellReview", method = RequestMethod.GET)
	public String tSellReview(Model model) throws Exception {
		
		List<TradeVO> tSellReview = service.tSellReview();
		model.addAttribute("tSellReview",tSellReview);	
		logger.info(tSellReview+"@@@@@@@@@@@@@@@@@@@@");
		
		
		return "/trade/sellReview";
	}

}
