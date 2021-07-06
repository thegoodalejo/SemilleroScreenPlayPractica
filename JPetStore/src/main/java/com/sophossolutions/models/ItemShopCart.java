package com.sophossolutions.models;

public class ItemShopCart {
	private String itemID;
	private String productId;
	private String description;
	private Boolean inStock;
	private String listPrice;
	
	public ItemShopCart(String itemID, String productId, Boolean inStock,String description, String listPrice) {
		this.itemID = itemID;
		this.productId = productId;
		this.description = description;
		this.inStock = inStock;
		this.listPrice = listPrice;
	}

	public String getItemID() {
		return itemID;
	}

	public String getProductId() {
		return productId;
	}

	public String getDescription() {
		return description;
	}

	public String getListPrice() {
		return listPrice;
	}

	public Boolean getInStock() {
		return inStock;
	}
	
}
