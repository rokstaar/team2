package com.market.service;


import java.util.List;

import com.market.domain.TradeVO;

public interface TradeService {

	public List<TradeVO> getBuyReview() throws Exception;

	public List<TradeVO> tSellReview() throws Exception;

}
