package com.market.persistence;

import java.util.List;

import com.market.domain.AuctionVO;

public interface AuctionDAO {
	public List<AuctionVO> getAList() throws Exception;
	
	public AuctionVO nowBest() throws Exception;
	
	public Integer registerAuction() throws Exception;

}
