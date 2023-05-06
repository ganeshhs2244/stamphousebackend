package com.codesquad.stamphousebackend.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;




@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	private String name;
	
	private Integer price;
	
	private String category;
	
	private String rating;
	
	@Lob
    private byte[] image;
	
	private String description;
	
	private Integer stockCount;

	public Product(Integer productId, String name, Integer price, String category, String rating, byte[] image,
			String description, Integer stockCount) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.image = image;
		this.description = description;
		this.stockCount = stockCount;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//rice, Category, Rating, Image, Description, Stock count 
	
	
	
}
