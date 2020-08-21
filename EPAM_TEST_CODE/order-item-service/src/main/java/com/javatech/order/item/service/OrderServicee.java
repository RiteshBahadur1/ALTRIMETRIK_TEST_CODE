package com.javatech.order.item.service;

import java.util.List;

import com.javatech.order.item.entity.OrderItem;


public interface OrderServicee {
	public List<OrderItem> getAllOrder();
	public void saveOrUpdate(OrderItem service);
	public OrderItem getOrderById(int id);
	
}
