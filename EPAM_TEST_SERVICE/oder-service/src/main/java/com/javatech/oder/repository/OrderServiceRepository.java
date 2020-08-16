package com.javatech.oder.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatech.oder.entity.OrderDetails;

public interface OrderServiceRepository extends CrudRepository<OrderDetails,Integer>{

}
