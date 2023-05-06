package com.codesquad.stamphousebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesquad.stamphousebackend.entity.Customer;
import com.codesquad.stamphousebackend.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	//CRUD
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void addAllCustomer(List<Customer> customerList) {
		customerRepository.saveAll(customerList);
	}
	
	
	public List<Customer> getAllCustomer(){
		List<Customer> allCustomer = customerRepository.findAll();
		return allCustomer;
	}
	
	public Optional<Customer> getCustomerById(Integer id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return customer;
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomerById(Integer id) {
		customerRepository.deleteById(id);
	}
	
}
