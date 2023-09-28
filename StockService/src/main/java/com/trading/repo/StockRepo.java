package com.trading.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trading.entity.Stock;

public interface StockRepo extends JpaRepository<Stock, Integer> {

}
