package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartModel {
    @Id
    private int cartId;
    private int cartItemId;
    private int productId;
    private int quantity;
	public CartModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartModel(int cartId, int cartItemId, int productId, int quantity) {
		super();
		this.cartId = cartId;
		this.cartItemId = cartItemId;
		this.productId = productId;
		this.quantity = quantity;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
}
