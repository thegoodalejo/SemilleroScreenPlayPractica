package com.sophos.semillero.model;

import java.util.ArrayList;

public class CartItemsModel {

	private double numOrderTotal;
	private ArrayList<ItemModel> listOrderItems;

	public CartItemsModel(ArrayList<ItemModel> listOrderItems) {
		this.listOrderItems = listOrderItems;
		// Calculate order total
		this.numOrderTotal = 0;
		for (ItemModel orderItem: listOrderItems) {
			this.numOrderTotal += orderItem.getNumTotalCost();
		}
	}

	public double getNumOrderTotal() {
		return numOrderTotal;
	}

	public ArrayList<ItemModel> getListOrderItems() {
		return listOrderItems;
	}
}
