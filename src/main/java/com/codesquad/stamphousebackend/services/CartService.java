package com.codesquad.stamphousebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesquad.stamphousebackend.entity.Cart;
import com.codesquad.stamphousebackend.repository.CartRepository;



@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	//CRUD
	
	public void addCart(Cart cart) {
		cartRepository.save(cart);
	}
	
	public List<Cart> getAllCart(){
		List<Cart> carts = cartRepository.findAll();
		return carts;
	}
	
	public Optional<Cart> getCartById(Integer id){
		Optional<Cart> carts = cartRepository.findById(id);
		return carts;
	}
	
	public void updateCart(Cart cart) {
		cartRepository.save(cart);
	}
	
	public void deleteCartById(Integer id) {
		cartRepository.deleteById(id);
	}
	
	
}
