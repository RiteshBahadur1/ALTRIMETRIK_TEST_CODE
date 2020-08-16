package com.javatech.oder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatech.oder.entity.OrderDetails;
import com.javatech.oder.exception.OrderNotFound;
import com.javatech.oder.repository.OrderServiceRepository;
@Service
public class OrderServiceImpl implements OrderServicee {

	@Autowired
	 OrderServiceRepository servicea;
	@Override
	public void saveOrUpdate(OrderDetails service) {
		servicea.save(service);
	}
	@Override
	public List<OrderDetails> getAllOrder() {
		List<OrderDetails> orders = new ArrayList<>();
		servicea.findAll().forEach(order -> orders.add(order));
		return orders;
	}
	@Override
	public OrderDetails getOrderById(int id) {
		// TODO Auto-generated method stub
		return servicea.findById(id).orElseThrow(() -> new OrderNotFound(id));
	}

}
