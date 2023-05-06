package com.codesquad.stamphousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codesquad.stamphousebackend.entity.Cart;



public interface CartRepository extends JpaRepository<Cart, Integer>{

}
