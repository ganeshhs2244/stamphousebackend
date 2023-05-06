package com.codesquad.stamphousebackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesquad.stamphousebackend.entity.Product;
import com.codesquad.stamphousebackend.services.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {

		List<Product> allProduct = productService.getAllProduct();
		return allProduct;
	}

	@PostMapping("/addAllProduct")
	public void addAllProduct(@RequestBody List<Product> productList) {
		productService.addAllProduct(productList);
	}

	@PostMapping("/addProduct")
	public void addProduct(Product product) {
		productService.addProduct(product);
	}

	@GetMapping("/getProductById/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		Optional<Product> productById = productService.getProductById(id);
		if (productById.isPresent()) {
			return ResponseEntity.ok(productById.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@PutMapping("/updateAllProduct")
	public void updateAllProduct(@RequestBody List<Product> productList) {
		productService.updateAllProduct(productList);
	}

	@PostMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		productService.delete(id);
	}
}
