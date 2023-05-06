package com.codesquad.stamphousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codesquad.stamphousebackend.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
