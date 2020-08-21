package com.javatech.oder.service;

import java.util.List;

import com.javatech.oder.entity.OrderDetails;

public interface OrderServicee {
	public List<OrderDetails> getAllOrder();
	public void saveOrUpdate(OrderDetails service);
	public OrderDetails getOrderById(int id);
	
}
