package com.cuevasprojects.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
