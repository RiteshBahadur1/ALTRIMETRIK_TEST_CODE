package com.example.controller;

public class StockNotAvailable extends RuntimeException {
	private Error error;
	public StockNotAvailable(String message) {
		super(message);
	}
	public StockNotAvailable(Error error) {
		super(error);
	}
}
