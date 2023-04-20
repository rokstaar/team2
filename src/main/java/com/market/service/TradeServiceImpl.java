package com.market.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.market.domain.TradeVO;
import com.market.persistence.TradeDAO;

@Service
public class TradeServiceImpl implements TradeService{
	
	private static final Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);
	
	@Inject
	private TradeDAO tdao;
	
	@Override
	public List<TradeVO> getBuyReview() throws Exception {
		
		return tdao.getBuyReview();
	}

	@Override
	public List<TradeVO> tSellReview() throws Exception {
		
		return tdao.tSellReview();
	}

	
	
}
