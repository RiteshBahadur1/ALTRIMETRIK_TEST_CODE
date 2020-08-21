package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Stocks;
import com.example.service.StockQuote;

@RestController
public class StockQuoteController {

	@Autowired
	private StockQuote stockQuotes;
	
	@GetMapping("/stockQuote/{param1}")
	public Stocks getStockQuote(@PathVariable("param1") String param1) {
		Stocks stockData = stockQuotes.getStocksdQuote(param1);
		if(stockData==null) {
			throw new StockNotAvailable("Stock Not Available");
		}
		return stockData;
	}
	
	@PostMapping("/stocks")
	public int saveStockQuote(@RequestBody Stocks stock) {
		stockQuotes.saveStockQuote(stock);
		
		return stock.getId();
	}
	@ExceptionHandler(StockNotAvailable.class)
	public String handleException(StockNotAvailable exe){
	
		return "Stock Quote Not Avilable";
		
	}
}
