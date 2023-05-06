package com.codesquad.stamphousebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesquad.stamphousebackend.entity.Product;
import com.codesquad.stamphousebackend.repository.ProductRepository;





@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		List<Product> allProduct = productRepository.findAll();
		return allProduct;
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void addAllProduct(List<Product> productList) {
		productRepository.saveAll(productList);
	}
	
	public Optional<Product> getProductById(Integer id){
		Optional<Product> product = productRepository.findById(id);
		return product;
	}

	public void updateProduct(Product product){
		productRepository.save(product);
	}
	
	public void updateAllProduct(List<Product> productList) {
		productRepository.saveAll(productList);
	}
	
	public void delete(Integer id) {
		productRepository.deleteById(id);
	}
	
}
