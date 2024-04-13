package com.cart.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductsEntity {
	@Id
	private String itemName;
	private String quantity;
	private int price;
	private String url;
	public ProductsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsEntity(String itemName, String quantity,int price,String url) {
		super();
		this.itemName = itemName;
		this.quantity=quantity;
		this.price = price;
		this.url=url;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

}
