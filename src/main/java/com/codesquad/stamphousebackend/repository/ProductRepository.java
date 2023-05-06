package com.codesquad.stamphousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesquad.stamphousebackend.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
