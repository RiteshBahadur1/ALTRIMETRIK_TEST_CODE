package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Stocks;
import com.example.repository.StockQuoteRepository;
@Service
public class StockQuoteServiceImpl implements StockQuote{

	@Autowired
	private StockQuoteRepository repository;
	
	@Override
	public Stocks getStocksdQuote(String stockQuote) {
		
		return repository.findByName(stockQuote);
	}

	@Override
	public void saveStockQuote(Stocks stock) {
		
		repository.save(stock);
	}

}
