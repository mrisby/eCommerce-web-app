package com.tts.eCommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.eCommerce.model.Cart;
import com.tts.eCommerce.model.Product;
import com.tts.eCommerce.model.User;
import com.tts.eCommerce.service.CartService;
import com.tts.eCommerce.service.ProductService;
import com.tts.eCommerce.service.UserService;

@Controller
@RequestMapping("/storefront")
public class CartController {
  @Autowired
  private ProductService productService;

  @Autowired
  private UserService userService;

@Autowired  
private CartService cartService;   

  @GetMapping("/cart")
  public String showCart() {
      return "cart";
  }

  @PostMapping("/cart")
  public String addToCart(@RequestParam long productId, Cart cart, @RequestParam Integer quantity, Model model) {
  		cart = cartService.addCartItemToCart(cart, productId, quantity);
      return "storefront/cart";
  }

  @PostMapping("/cart")
  public String changeCartCartItemQuantity(@RequestParam Long productId, Cart, cart, @RequestParam Integer quantity, Model model) {
  	cart = cartService.updateCartItemQuantity(cart, productId, quantity);
  	return "storefront/cart";
  }

  @PatchMapping("/cart")
  public String updateQuantities(@RequestParam long[] id, @RequestParam int[] quantity) {
      for(int i = 0; i < id.length; i++) {
          Product p = productService.findById(id[i]);
          setQuantity(p, quantity[i]);
          //do one by one
      }
      return "cart";
  }
  
}
