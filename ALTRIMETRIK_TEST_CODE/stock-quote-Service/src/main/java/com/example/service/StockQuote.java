package com.example.service;

import com.example.entity.Stocks;

public interface StockQuote {
	
	public Stocks getStocksdQuote(String stockQuote);
	public void saveStockQuote(Stocks stock);

}
