package com.codesquad.stamphousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codesquad.stamphousebackend.entity.Coupon;



public interface CouponRepository extends JpaRepository<Coupon, Integer>{

}
