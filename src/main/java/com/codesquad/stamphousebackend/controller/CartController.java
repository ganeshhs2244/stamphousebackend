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

import com.codesquad.stamphousebackend.entity.Cart;
import com.codesquad.stamphousebackend.services.CartService;



@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/addCart")
	public void addCart(@RequestBody Cart cart) {
		cartService.addCart(cart);
	}

	@GetMapping("/getAllCart")
	public List<Cart> getAllCart() {
		List<Cart> carts = cartService.getAllCart();
		return carts;
	}

	@GetMapping("/getCartById")
	public Optional<Cart> getCartById(Integer id) {
		Optional<Cart> carts = cartService.getCartById(id);
		return carts;
	}

	
	@PutMapping("/updateCart")
	public void updateCart(Cart cart) {
		cartService.updateCart(cart);
	}

	@PostMapping("/deleteCartById")
	public void deleteCartById(Integer id) {
		cartService.deleteCartById(id);
	}
}
