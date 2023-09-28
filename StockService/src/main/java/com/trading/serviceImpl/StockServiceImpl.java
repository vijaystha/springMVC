package com.trading.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.trading.entity.Stock;
import com.trading.repo.StockRepo;
import com.trading.service.StockService;

public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepo daoImpl;
	@Override
	public String saveStock(Stock stock) {
		// TODO Auto-generated method stub
		
		Stock saveStock = daoImpl.save(stock);
		String msg="";
		if(saveStock!=null)
		msg="data insertion successfully!!";
		else
			msg="Not inserted. Failed";
		
		return msg;
	}

	@Override
	public List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		List<Stock> addStocks= daoImpl.findAll();
		return addStocks;
	}

	@Override
	public Stock viewStockId(int sid) {
		// TODO Auto-generated method stub
		Optional<Stock> findById= daoImpl.findById(sid);
		Stock stock=findById.get();
		return stock;
	}

}
