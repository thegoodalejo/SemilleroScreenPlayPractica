package com.sophossolutions.models;

public class ItemShopCar extends ItemAnimal {

	private String strInStock;
	private String strQuantity;
	private String strTotalCost;
	
	public ItemShopCar(String itemID, String productId, String description, String strInStock, String strQuantity,String listPrice, String strTotalCost) {
		super(itemID, productId, description, listPrice);
		this.strInStock = strInStock;
		this.strQuantity = strQuantity;
		this.strTotalCost = strTotalCost;
		
	}

	public String getStrInStock() {
		return strInStock;
	}

	public String getStrQuantity() {
		return strQuantity;
	}

	public String getStrTotalCost() {
		return strTotalCost;
	}

//	public void setStrTotalCost(String listPriceIn, String strQuantity) {
//		Double intValAux = Double.parseDouble(listPriceIn.replace("$", ""))*Double.parseDouble(strQuantity);
//		this.strTotalCost = "$" + intValAux.toString();
//	}
	
	public void showData() {
		String base = "|%25s|%25s|%25s|%25s|%25s|%25s|%25s|";
		System.out.println(
				String.format(base, "Item Id", "Product Id", "Description", "In Stock","Quantity","List Price","Total Cost") + "\n" +
				String.format(base, getItemID(), getProductId(), getDescription(), getStrInStock(), getStrQuantity(),getListPrice(), getStrTotalCost() ) 
				);
	}
}
