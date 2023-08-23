package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerModel {
	@Id
	private int CustomerId;
	private String CustomerName;
	private String EmailId;
	private String Address;
	private String Password;
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerModel(int customerId, String customerName, String emailId, String address, String password) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		EmailId = emailId;
		Address = address;
		Password = password;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
    
}
