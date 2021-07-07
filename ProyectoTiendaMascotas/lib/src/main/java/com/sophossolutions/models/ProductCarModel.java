package com.sophossolutions.models;

public class ProductCarModel {

	private String strItemId;
	private String strDescription;
	private String strQuantity;
	private String strPrice;
	private String strTotalCost;
	
	public ProductCarModel(String strItemId, String strDescription, String strQuantity, String strPrice,
			String strTotalCost) {
		super();
		this.strItemId = strItemId;
		this.strDescription = strDescription;
		this.strQuantity = strQuantity;
		this.strPrice = strPrice;
		this.strTotalCost = strTotalCost;
	}
	
	public String getStrItemId() {
		return strItemId;
	}
	public String getStrDescription() {
		return strDescription;
	}
	public String getStrQuantity() {
		return strQuantity;
	}
	public String getStrPrice() {
		return strPrice;
	}
	public String getStrTotalCost() {
		return strTotalCost;
	}
	
}
