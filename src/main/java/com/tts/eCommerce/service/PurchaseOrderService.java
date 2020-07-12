package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.PurchaseOrder;
import com.tts.eCommerce.repository.PurchaseOrderRepository;


@Service
public class PurchaseOrderService {

	@Autowired
	private PurchaseOrderRepository purchaseOrderRepository;

	public PurchaseOrder makePurchaseOrder(Cart cart) {
		PurchaseOrder thatObject = new PurchaseOrder();
		//code
		return thatObject;
	}

	//public Double salesTax(Double subTotal) {
		//math
	//	return salesTax;
	// }
}

	
