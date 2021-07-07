package com.grupo3.model;

public class Animal {

	private String itemID;
	private String productID;
	private double listPrice;
	
	public Animal(String itemID, String productID, String listPrice) {
		this.itemID = itemID;
		this.productID = productID;
		this.listPrice = Double.parseDouble(listPrice.substring(1));
	}
	
	public String getItemID() {
		return this.itemID;
	}
	
}
