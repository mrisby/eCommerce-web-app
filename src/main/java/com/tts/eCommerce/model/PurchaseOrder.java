package com.tts.eCommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "purchase_order_id")
	private Long id;

	public static Order makePurchaseOrder(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}


}
