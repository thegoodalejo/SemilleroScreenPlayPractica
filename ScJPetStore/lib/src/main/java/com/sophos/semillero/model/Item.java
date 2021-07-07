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
		this.itemID = itemID;
		this.productID = productID;
		this.description = description;
		this.inStock = inStock;
		Quantity = quantity;
		this.listPrice = listPrice;
		this.totalCost = totalCost;
	}
	
	public Item(String itemID, String productID) {
		this.itemID = itemID;
		this.productID = productID;
	}
	
	public Item(String itemID) {
		this.itemID = itemID;
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

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	
	@Override
	public boolean equals(Object obj) {
		Item itemOtro = (Item) obj;
		
		if(this.itemID.equals(itemOtro.getItemID())) {
			return true;
		}
		else {
			return false;
		}
	}	

}
