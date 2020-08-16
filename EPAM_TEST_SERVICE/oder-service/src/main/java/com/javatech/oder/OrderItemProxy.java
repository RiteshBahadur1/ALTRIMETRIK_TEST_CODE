package com.javatech.oder;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javatech.oder.entity.OrderItem;


@FeignClient(name="order-item-service",url="localhost:8083")
public interface OrderItemProxy {

	@GetMapping("/orderItem")
	public String getOrderItem();
	@GetMapping("/order/{id}")
	public OrderItem getOrder(int id);
}
