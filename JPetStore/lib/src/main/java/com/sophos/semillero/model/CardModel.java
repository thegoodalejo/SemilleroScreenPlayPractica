package com.sophos.semillero.model;

public class CardModel {

	private String strCardType;
	private int intCardNumber;
	private String strCardExpiryDate;

	public CardModel(String strCardType, int intCardNumber, String strCardExpiryDate) {
		this.strCardType = strCardType;
		this.intCardNumber = intCardNumber;
		this.strCardExpiryDate = strCardExpiryDate;
	}

	public String getStrCardType() {
		return strCardType;
	}

	public int getIntCardNumber() {
		return intCardNumber;
	}

	public String getStrCardExpiryDate() {
		return strCardExpiryDate;
	}
}
