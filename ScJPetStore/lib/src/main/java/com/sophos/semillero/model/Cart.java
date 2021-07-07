package com.sophos.semillero.model;

import java.util.List;

public class Cart {
	
	private List<Item> listItems;
	private String subTotal;
	
	public Cart(List<Item> listItems, String subTotal) {
		this.listItems = listItems;
		this.subTotal = subTotal;
	}

	public List<Item> getListItems() {
		return listItems;
	}

	public String getSubTotal() {
		return subTotal;
	}	

}
