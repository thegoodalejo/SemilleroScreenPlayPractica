package com.sophos.semillero.model;

public class Item {
	
	private String itemID;
	private String productID;
	private String description;
	private boolean inStock;
	private String Quantity;
	private String listPrice;
	private String totalCost;
	
	public Item(String itemID, String productID, String description, boolean inStock, String quantity, String listPrice,
			String totalCost) {
		super();
		this.itemID = itemID;
		this.productID = productID;
		this.description = description;
		this.inStock = inStock;
		Quantity = quantity;
		this.listPrice = listPrice;
		this.totalCost = totalCost;
	}

	public String getItemID() {
		return itemID;
	}

	public String getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public boolean isInStock() {
		return inStock;
	}

	public String getQuantity() {
		return Quantity;
	}

	public String getListPrice() {
		return listPrice;
	}

	public String getTotalCost() {
		return totalCost;
	}

}
