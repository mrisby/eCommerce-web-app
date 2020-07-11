package com.tts.eCommerce.service;

@Service
public class OrderService {

	public Order makePurchaseOrder(Cart cart) {
		Order thatObject = new Order();
		//code
		return thatObject;
	}
	
	private Double calcSalesTax(Double subTotal) {
		//math
		return salesTax;
	}
}
