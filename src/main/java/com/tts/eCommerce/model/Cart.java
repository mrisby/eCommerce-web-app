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
	@Column( name = "cart_id")
	private Long id;
	
	private Double subTotal;
	private Double total;
	private List<HashMap<Product, Integer>> lineItems;
	
	public Cart() {}
}
