package com.market.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class AuctionVO {
	private int au_num;
	private int au_startPrice;
	private Date au_endTime;
	private String sellerId;
	private String buyerId;
	private int au_bidPrice;
	private int au_endPrice;
	private String au_pic;
	private int au_status;
	private String au_title;
	private String au_content;
	private String au_category;

}
