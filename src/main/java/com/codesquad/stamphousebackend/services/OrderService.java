package com.codesquad.stamphousebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesquad.stamphousebackend.entity.Orders;
import com.codesquad.stamphousebackend.repository.OrderRepository;



@Service
public class OrderService {
		
	@Autowired
	private OrderRepository orderRepository;
	
	//CRUD
	
	public void addOrder(Orders order) {
		orderRepository.save(order);
	}
	
	public List<Orders> getAllOrder(){
		List<Orders> allOrders = orderRepository.findAll();
		return allOrders;
	}
	
	public Optional<Orders> getOrderById(Integer id) {
		Optional<Orders> orderById = orderRepository.findById(id);
		return orderById;
	}
	
	public void updateOrder(Orders order) {
		orderRepository.save(order);
	}
	
	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	}
}
