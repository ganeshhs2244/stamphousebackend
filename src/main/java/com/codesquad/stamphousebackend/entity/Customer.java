package com.codesquad.stamphousebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Customer {
	
	

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomerphoneNum() {
		return customerphoneNum;
	}

	public void setCustomerphoneNum(String customerphoneNum) {
		this.customerphoneNum = customerphoneNum;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer customerId;
	
	private String firstName;
	
	private String lastName;
	
	private String customeremail;
	
	private String customerphoneNum;
	
	private String customerAddress;
	
	public Customer(Integer customerId, String firstName, String lastName, String customeremail,
			String customerphoneNum, String customerAddress) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customeremail = customeremail;
		this.customerphoneNum = customerphoneNum;
		this.customerAddress = customerAddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
