package com.sophos.semillero.model;

public class OrderCardModel {

	private String strCardType;
	private String strCardNumber;
	private String strCardExpiryDate;

	public OrderCardModel(String strCardType, String strCardNumber, String strCardExpiryDate) {
		this.strCardType = strCardType;
		this.strCardNumber = strCardNumber;
		this.strCardExpiryDate = strCardExpiryDate;
	}

	public String getStrCardType() {
		return strCardType;
	}

	public String getStrCardNumber() {
		return strCardNumber;
	}

	public String getStrCardExpiryDate() {
		return strCardExpiryDate;
	}
}
