package com.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.persistence.ChatRoomDAO;


@Service
public class ChatRoomServiceImpl implements ChatRoomService {

	@Autowired
	private ChatRoomDAO crdao;

}
