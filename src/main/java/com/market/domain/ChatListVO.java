package com.market.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class ChatListVO {

	private int chat_num;
	private String chat_subject;
	private Date chat_date;
	private String chat_pic;
	private String chat_profile;
	private String chat_seller;
}
