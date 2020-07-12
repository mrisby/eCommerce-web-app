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
}
