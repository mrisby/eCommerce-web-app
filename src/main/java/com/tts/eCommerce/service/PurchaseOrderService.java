package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Order;
import com.tts.eCommerce.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public Order makePurchaseOrder(Cart cart) {
		Order thatObject = new Order();
		//code
		return thatObject;
	}

	public Double salesTax(Double subTotal) {
		//math
		Double salesTax = new Double();
		return salesTax;
	}
}
