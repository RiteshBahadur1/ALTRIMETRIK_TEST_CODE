package com.javatech.oder;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.oder.entity.OrderDetails;
import com.javatech.oder.service.OrderServicee;

@RestController
//@RequestMapping("/orderService")
public class OrderController {
  
	@Autowired
	OrderServicee servicec;
	//@Autowired
	//private OrderProxy proxy;
	
	@GetMapping("/orderDetail")
	private List<OrderDetails> getAllOrders() 
	{
	return servicec.getAllOrder();
	}
	@PostMapping("/orderDetail")
	
	private int saveStudent(@Valid @RequestBody OrderDetails service) 
	{
		servicec.saveOrUpdate(service);
	return service.getId();
	}
	
	@GetMapping("/orderDetail/{id}")
	private OrderDetails getStudent(@PathVariable("id") int id) 
	{
	return servicec.getOrderById(id);
	}
}
