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

import com.codesquad.stamphousebackend.entity.Coupon;
import com.codesquad.stamphousebackend.services.CouponService;



@RestController
@RequestMapping("/coupons")
public class CouponController {

	@Autowired
	private CouponService couponService;

	@PostMapping("/addCoupon")
	public void addCoupon(@RequestBody Coupon coupon) {
		couponService.addCoupon(coupon);
	}

	@GetMapping("/getAllCoupon")
	public List<Coupon> getAllCoupon() {
		List<Coupon> coupon = couponService.getAllCoupon();
		return coupon;
	}

	@GetMapping("/getCouponById")
	public Optional<Coupon> getCouponById(Integer id) {
		Optional<Coupon> coupon = couponService.getCouponById(id);
		return coupon;
	}
	
	@PutMapping("/updateCoupon")
	public void updateCoupon(Coupon coupon) {
		couponService.updateCoupon(coupon);
	}

	@PostMapping("/deleteCouponById")
	public void deleteCouponById(Integer id) {
		couponService.deleteCouponById(id);
	}

}
