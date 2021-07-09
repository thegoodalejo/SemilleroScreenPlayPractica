package com.sophos.semillero.model;

import java.util.ArrayList;

public class OrderPurchasesModel {

	private double numOrderTotal;
	private ArrayList<OrderItemModel> listOrderItems;

	public OrderPurchasesModel(ArrayList<OrderItemModel> listOrderItems) {
		this.listOrderItems = listOrderItems;
		// Calculate order total
		this.numOrderTotal = 0;
		for (OrderItemModel orderItem: listOrderItems) {
			this.numOrderTotal += orderItem.getNumTotalCost();
		}
	}

	public double getNumOrderTotal() {
		return numOrderTotal;
	}

	public ArrayList<OrderItemModel> getListOrderItems() {
		return listOrderItems;
	}
}
