package com.codesquad.stamphousebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesquad.stamphousebackend.entity.Coupon;
import com.codesquad.stamphousebackend.repository.CouponRepository;


@Service
public class CouponService {

	@Autowired
	private CouponRepository couponRepository;

	public void addCoupon(Coupon coupon) {
		couponRepository.save(coupon);
	}

	public List<Coupon> getAllCoupon() {
		List<Coupon> coupon = couponRepository.findAll();
		return coupon;
	}

	public Optional<Coupon> getCouponById(Integer id) {
		Optional<Coupon> coupon = couponRepository.findById(id);
		return coupon;
	}

	public void updateCoupon(Coupon coupon) {
		couponRepository.save(coupon);
	}

	public void deleteCouponById(Integer id) {
		couponRepository.deleteById(id);
	}

}
