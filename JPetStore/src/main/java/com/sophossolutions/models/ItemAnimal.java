package com.sophossolutions.models;

public class ItemAnimal {
	private String itemID;
	private String productId;
	private String description;
	private String listPrice;
	
	public ItemAnimal(String itemID, String productId, String description, String listPrice) {
		this.itemID = itemID;
		this.productId = productId;
		this.description = description;
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
	
	public void showAnimal() {
		String base = "|%25s|%25s|%25s|%25s|";
		System.out.println(
				String.format(base, "Item Id", "Product Id", "Description", "List Price") + "\n" +
				String.format(base, getItemID(), getProductId(), getDescription(), getListPrice() ) 
				);
	}
	
}
