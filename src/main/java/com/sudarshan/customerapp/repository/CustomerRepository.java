package com.sudarshan.customerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sudarshan.customerapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
