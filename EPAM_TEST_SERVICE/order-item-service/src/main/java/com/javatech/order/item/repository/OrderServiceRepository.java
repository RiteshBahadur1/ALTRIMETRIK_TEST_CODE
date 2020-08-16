package com.javatech.order.item.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatech.order.item.entity.OrderItem;


public interface OrderServiceRepository extends CrudRepository<OrderItem,Integer>{

}
