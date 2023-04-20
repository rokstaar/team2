package com.market.persistence;

import java.util.List;

import com.market.domain.TradeVO;

public interface TradeDAO {

	public List<TradeVO> getBuyReview() throws Exception;
	
	public List<TradeVO> tSellReview() throws Exception;
}
