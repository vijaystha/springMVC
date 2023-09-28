package com.trading.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Stock_table")
public class Stock {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name= "stockId")
private int stockId;
@Column(name= "stockName")
private String stockName;
@Column(name= "Price")
private int Price;
}
