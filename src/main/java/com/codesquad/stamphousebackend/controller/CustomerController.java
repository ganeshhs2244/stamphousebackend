package com.codesquad.stamphousebackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesquad.stamphousebackend.entity.Customer;
import com.codesquad.stamphousebackend.services.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	
	@PostMapping("/addAllCustomer")
	public void addAllCustomer(@RequestBody List<Customer> customerList) {
		customerService.addAllCustomer(customerList);
	}
	
	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer(){
		List<Customer> allCustomer = customerService.getAllCustomer();
		return allCustomer;
	}
	
	
	@GetMapping("/getCustomerByID/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Integer id) {
		Optional<Customer> customer = customerService.getCustomerById(id);
		return customer;
	}
	
	
	@PutMapping("/updateCustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
	
	@PostMapping("/deleteCustomerById/{id}")
	public void deleteCustomerById(@PathVariable Integer id) {
		customerService.deleteCustomerById(id);
	}
}
