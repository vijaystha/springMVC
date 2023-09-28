package com.trading.service;

import java.util.List;

import com.trading.entity.Stock;



public interface StockService {
	public String saveStock(Stock stock);

	//retrivee product from db
	public List<Stock>getAllStocks();

	//specific record
	public Stock viewStockId(int sid);
}
