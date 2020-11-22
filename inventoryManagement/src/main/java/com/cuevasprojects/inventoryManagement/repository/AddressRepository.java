package com.cuevasprojects.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cuevasprojects.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address,Long> {

}
