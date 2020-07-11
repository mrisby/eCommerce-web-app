package com.tts.eCommerce.service;

@Service
public class PurchaseOrderService {

	public PurchaseOrder makePurchaseOrder(Cart cart) {
		PurchaseOrder thatObject = new PurchaseOrder();
		//code
		return thatObject;
	}
	
	private Double calcSalesTax(Double subTotal) {
		//math
		return salesTax;
	}
}
