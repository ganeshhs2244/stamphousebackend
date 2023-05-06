package com.codesquad.stamphousebackend.entity;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	
	private Integer productId;
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	private LocalDate date;
	
	private Integer productCount;
	
	private Double totalPrice;

	public Orders(Integer orderId, Integer productId, LocalDate date, Integer productCount, Double totalPrice) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.date = date;
		this.productCount = productCount;
		this.totalPrice = totalPrice;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
