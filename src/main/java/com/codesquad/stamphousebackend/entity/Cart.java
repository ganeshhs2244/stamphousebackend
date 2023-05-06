package com.codesquad.stamphousebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cart{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cartId;
	
	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	private Integer customerId;
	
	private Integer productId;

	public Cart(Integer cartId, Integer customerId, Integer productId) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.productId = productId;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
