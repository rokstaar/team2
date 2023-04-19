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

@Controller
@RequestMapping(value = "/members")
public class MembersController {
	
	

	@Inject
	private MemberService service;

	private static final Logger logger = LoggerFactory.getLogger(MembersController.class);
	
	//http://localhost:8080/main
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGET() {
		
		return "/members/loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPOST(HttpSession session, MemberVO vo) {
		
		MemberVO result = service.loginMember(vo);
		
		if(result != null) {
			session.setAttribute("id", result.getMember_id());
			
			return "redirect:/main";
		}else {
			return "redirect:/members/login";
		}
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutGET(HttpSession session) {
		session.invalidate();
		
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/myPage", method = RequestMethod.GET)
	public String myPageGET() {
		
		
		return "/members/myPage";
	}

}
