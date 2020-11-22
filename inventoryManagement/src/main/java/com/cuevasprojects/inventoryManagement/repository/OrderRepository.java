package com.cuevasprojects.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
