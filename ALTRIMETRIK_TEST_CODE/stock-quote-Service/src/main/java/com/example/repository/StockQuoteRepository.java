package com.example.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.entity.Stocks;

public interface StockQuoteRepository extends CrudRepository<Stocks,Integer>{
	@Query(value="SELECT * FROM Stocks where STOCK_QUOTE=:stockQuote",nativeQuery=true)
	Stocks findByName(@Param("stockQuote") String stockQuote);
}
