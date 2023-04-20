package com.market.service;

import java.util.List;

import com.market.domain.AuctionVO;


public interface AuctionService {
	
	public List<AuctionVO> getAList() throws Exception;
	
	public AuctionVO nowBest() throws Exception;
	
	public Integer registAuction() throws Exception;
}
