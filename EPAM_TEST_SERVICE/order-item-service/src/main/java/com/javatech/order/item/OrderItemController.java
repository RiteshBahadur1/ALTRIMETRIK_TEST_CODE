package com.javatech.order.item;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.order.item.entity.OrderItem;
import com.javatech.order.item.service.OrderServicee;


@RestController
//@RequestMapping("/orderItem")
public class OrderItemController {

	@Autowired
	OrderServicee servicec;
	//@Autowired
	//private OrderItemProxy proxy;
	
	@GetMapping("/order")
	private List<OrderItem> getAllOrders() 
	{
	return servicec.getAllOrder();
	}
	@PostMapping("/order")
	
	private int saveOrder(@Valid @RequestBody OrderItem service) 
	{
		servicec.saveOrUpdate(service);
	return service.getId();
	}
	
	@GetMapping("/order/{id}")
	private OrderItem getOrder(@PathVariable("id") int id) 
	{
	return servicec.getOrderById(id);
	}
}
