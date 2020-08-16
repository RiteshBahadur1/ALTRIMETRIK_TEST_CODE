package com.javatech.order.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatech.order.item.entity.OrderItem;
import com.javatech.order.item.repository.OrderServiceRepository;

@Service
public class OrderServiceImpl implements OrderServicee {

	@Autowired
	 OrderServiceRepository servicea;
	@Override
	public void saveOrUpdate(OrderItem service) {
		servicea.save(service);
	}
	@Override
	public List<OrderItem> getAllOrder() {
		List<OrderItem> orders = new ArrayList<>();
		servicea.findAll().forEach(order -> orders.add(order));
		return orders;
	}
	@Override
	public OrderItem getOrderById(int id) {
		// TODO Auto-generated method stub
		return servicea.findById(id).get();
	}

}
