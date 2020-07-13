package com.tts.eCommerce.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartitem_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	private BigDecimal price;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "purchaseOrder_id")
	private PurchaseOrder purchaseOrder;
	
	public CartItem() {
	}

	public CartItem(Product product, BigDecimal price, int quantity, PurchaseOrder purchaseOrder) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.purchaseOrder = purchaseOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", product=" + product + ", price=" + price + ", quantity=" + quantity
				+ ", purchaseOrder=" + purchaseOrder + "]";
	}

}