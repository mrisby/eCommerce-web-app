package com.tts.eCommerce.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "purchase_order_id")
	private Long id;
		
	@Column
	private Integer purchaseOrderNumber;
	private String shippingMethod;
	private Double salesTax;
	private Integer zeroCart;
	private Double subTotal;
	private Double grandTotal;
	private String paymentMethod;	
	// could also be cartItems
	public List<HashMap<Product, Integer>> cart;
	
	
	@JoinColumn(name = "user_id")
	private String username;
	
	
	@CreationTimestamp
	private Date createdAt;

	@UpdateTimestamp
	private Date updatedAt;

	public static PurchaseOrder makePurchaseOrder(Cart cart2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
// make purchase order public 
	//return a purchase order
	//
}


