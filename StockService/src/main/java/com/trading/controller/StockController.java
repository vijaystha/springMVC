package com.trading.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trading.entity.Stock;
import com.trading.serviceImpl.StockServiceImpl;
@RestController
@RequestMapping("/stock")
public class StockController {
	
	
	private StockServiceImpl daoService;
	
//	@GetMapping("/hi/{name}")
//	public String sayHi(@PathVariable ("name") String name) {
//return " Hi :" + name;
//	}
	@PostMapping("/create")
	public String createStock(@RequestBody Stock stock) {
	 String saveStock= daoService.saveStock(stock);
		return saveStock;
	}
	@GetMapping("/fetchProduct")
	public List<Stock> findAll(){
		return daoService.getAllStocks();
	}
	
}