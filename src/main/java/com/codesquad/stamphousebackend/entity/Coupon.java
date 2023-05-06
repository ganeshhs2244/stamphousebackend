package com.codesquad.stamphousebackend.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Coupon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer couponId;
	
	private String couponCode;
	
	public Integer getCouponId() {
		return couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	private Double discountPercent;
	
	private LocalDate expiryDate;

	public Coupon(Integer couponId, String couponCode, Double discountPercent, LocalDate expiryDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.discountPercent = discountPercent;
		this.expiryDate = expiryDate;
	}

	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
}
