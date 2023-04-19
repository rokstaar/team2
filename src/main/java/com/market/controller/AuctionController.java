package com.market.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.domain.AuctionVO;
import com.market.service.AuctionService;

@Controller
@RequestMapping(value = "/auction/*")
public class AuctionController {
	
	@Inject
	private AuctionService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String AListGET(Model model) throws Exception {
		List<AuctionVO> aList = service.getAList();
		
		
		model.addAttribute("aList", aList);
		model.addAttribute("best", service.nowBest());
		
		return "/auction/auctionList";
	}
	
	@RequestMapping(value = "/aRegist", method = RequestMethod.GET)
	public String auctionRegistGET(HttpSession session) {
		String id = (String)session.getAttribute("id");
		
		if(id == null) {
			return "redirect:/members/login";
		}
		
		return "/auction/aRegist";
	}
	
	@RequestMapping(value = "/aRegist", method = RequestMethod.POST)
	public String auctionRegistPOST(AuctionVO vo) {
		
		
		return "redirect:/auction/list";
	}

}


















