package com.market.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	

	private static final Logger logger 
	             = LoggerFactory.getLogger(AdminController.class);
	
	// http://localhost:8080/admin/mypage
	@RequestMapping(value = "mypage",method = RequestMethod.GET)
	public String mypageGET() {
		return "/admin/myPage";
	}
	
	// http://localhost:8080/admin/notice
	@RequestMapping(value = "notice",method = RequestMethod.GET)
	public void noticeGET() {

	}
	
	
	


}
