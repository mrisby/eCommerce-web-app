package com.tts.eCommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.PurchaseOrder;

@Controller
@RequestMapping
public class PurchaseOrderController {

	@GetMapping("/checkout")
	public String checkout(Cart cart, Model model) {
		//user current user login
		PurchaseOrder purchaseOrder = PurchaseOrder.makePurchaseOrder(cart);
		model.addAttribute("purchaseOrder", purchaseOrder);
		return "storefront/invoice";
		
		//send a cart
		
		

		
	}
}
