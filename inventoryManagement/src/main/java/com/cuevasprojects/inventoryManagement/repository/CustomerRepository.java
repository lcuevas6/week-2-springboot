package com.cuevasprojects.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
