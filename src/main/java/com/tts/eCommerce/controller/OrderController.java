package com.tts.eCommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Order;

@Controller
@RequestMapping
public class OrderController {

	@GetMapping("/checkout")
	public String checkout(Cart cart, Model model) {
		Order purchaseOrder = orderService.makePurchaseOrder(cart);
		model.addAttribute("purchaseOrder", purchaseOrder);
		return "storefront/invoice";
	}
}
