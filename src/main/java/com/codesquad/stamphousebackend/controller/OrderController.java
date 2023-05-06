package com.codesquad.stamphousebackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesquad.stamphousebackend.entity.Orders;
import com.codesquad.stamphousebackend.services.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/addOrder")
	public void addOrder(@RequestBody Orders order) {
		orderService.addOrder(order);
	}
	
	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrder(){
		List<Orders> allOrders = orderService.getAllOrder();
		return allOrders;
	}
	
	@GetMapping("/getOrderById")
	public Optional<Orders> getOrderById(Integer id) {
		Optional<Orders> orderById = orderService.getOrderById(id);
		return orderById;
	}
	
	@PutMapping("/updateOrder")
	public void updateOrder(Orders order) {
		orderService.updateOrder(order);
	}
	
	
	@PostMapping("/deleteById")
	public void deleteOrder(Integer id) {
		orderService.deleteOrder(id);
	}
}
