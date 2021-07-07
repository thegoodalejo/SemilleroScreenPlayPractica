package com.grupo3.model;

import com.grupo3.util.RemoveDollarSign;

public class Animal {

	private String itemID;
	private String productID;
	private String description;
	private double listPrice;
	
	public Animal(String itemID, String productID, String description, String listPrice) {
		this.itemID = itemID;
		this.productID = productID;
		this.description = description;
		this.listPrice = RemoveDollarSign.from(listPrice);
	}
	
	public String getItemID() {
		return this.itemID;
	}
	
	public double getListPrice() {
		return this.listPrice;
	}

	public String getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal a = (Animal)obj;
			return a.itemID.equals(this.itemID);
		}
		return false;
	}
	
		
	
}
