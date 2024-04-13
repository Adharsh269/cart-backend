package com.cart.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartEntity {
	
	@Id
	private String itemName;
	private int quantity;
	private int price;
	public CartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartEntity(String itemName, int quantity,int price) {
		super();
		this.itemName = itemName;
		this.quantity=quantity;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
