package com.sophos.semillero.model;

import java.util.List;

public class Cart {
	
	private List<Item> listItems;
	private String subTotal;
	
	public Cart(List<Item> listItems, String subTotal) {
		this.listItems = listItems;
		this.subTotal = subTotal;
	}
	
	public Cart(List<Item> listItems) {
		this.listItems = listItems;
	}

	public List<Item> getListItems() {
		return listItems;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setListItems(List<Item> listItems) {
		this.listItems = listItems;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}	
	
	

}
