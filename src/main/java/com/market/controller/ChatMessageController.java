package com.market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.domain.ChatMessageVO;
import com.market.domain.ChatRoomVO;
import com.market.service.ChatMessageService;
import com.market.service.ChatRoomService;

@Controller
public class ChatMessageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatMessageController.class);
	
	@Autowired
	private ChatRoomService crservice;
	
//	@Autowired
//	private ChatMessageService cmservice;
		
    
//	// ä�� �½�Ʈ ------------------------------------------------------
//    @RequestMapping("/test/{id}")
//    public String test(HttpSession session, @PathVariable String id) {
//        session.setAttribute("id", id);
//        return "chat/test";
//    }
//    
//	// ä���ϱ�
//	@RequestMapping(value = "/chat", method = RequestMethod.GET)
//	public String createChatroom(HttpSession session, Model model, ChatRoomVO crvo) {
//		
//		// �α��� ����
//		String id = (String) session.getAttribute("id");
//		if(id == null) {
//			return "redirect:/members/insert";
//		}
//		
//		crvo.setSeller(id);
//		
//		
//		return "/chat/myChat";
//	}
	
	public List<ChatMessageVO> registChatDiaolog(HttpSession session) {
		
		String id = (String) session.getAttribute("id");
		
		
		
		return null;
		
	}
	



}
