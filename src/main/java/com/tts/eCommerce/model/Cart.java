package com.tts.eCommerce.model;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private Long id;

	public Double subTotal;
	public Double total;
	public List<HashMap<Product, Integer>> cartItems;
	

	public Cart() {
	}

	public Cart(Double subTotal, Double total, List<HashMap<Product, Integer>> cartItems) {
		this.subTotal = subTotal;
		this.total = total;
		this.cartItems = cartItems;
		
	}

	public Double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public List<HashMap<Product, Integer>> getCartItems() {
		return cartItems;
	}


	public void setCartItems(List<HashMap<Product, Integer>> cartItems) {
		this.cartItems = cartItems;
	}


	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", subTotal=" + subTotal + ", total=" + total + ", cartItems=" + cartItems + "]";
	}
	
}
