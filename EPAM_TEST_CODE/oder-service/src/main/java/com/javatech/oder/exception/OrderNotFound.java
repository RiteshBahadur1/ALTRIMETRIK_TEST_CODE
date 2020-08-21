package com.javatech.oder.exception;

public class OrderNotFound extends RuntimeException {
	public OrderNotFound(int id) {

        super(String.format("Order with Id %d not found", id));
    }
}
