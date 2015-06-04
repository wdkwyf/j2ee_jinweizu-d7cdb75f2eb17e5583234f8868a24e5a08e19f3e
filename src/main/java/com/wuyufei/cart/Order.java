package com.wuyufei.cart;

public class Order {
	private String product;
	private int price;
	private int qty;
	public Order(String product, int price, int qty) {
		super();
		this.product = product;
		this.price = price;
		this.qty = qty;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
}
