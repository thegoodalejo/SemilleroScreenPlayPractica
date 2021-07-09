package com.sophos.semillero.model;

public class ItemModel {

	private String strItemId;
	private String strItemDescription;
	private int numItemQuantity;
	private double numItemPrice;
	private double numTotalCost;
	
	public ItemModel(String strItemId, String strItemDescription, int numItemQuantity, double numItemPrice) {
		this.strItemId = strItemId;
		this.strItemDescription = strItemDescription;
		this.numItemQuantity = numItemQuantity;
		this.numItemPrice = numItemPrice;
		this.numTotalCost = numItemPrice * numItemQuantity;
	}

	public String getStrItemId() {
		return strItemId;
	}

	public String getStrItemDescription() {
		return strItemDescription;
	}

	public int getNumItemQuantity() {
		return numItemQuantity;
	}
	
	public double getNumItemPrice() {
		return numItemPrice;
	}

	public double getNumTotalCost() {
		return numTotalCost;
	}
}
