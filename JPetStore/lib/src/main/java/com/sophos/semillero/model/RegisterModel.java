package com.sophos.semillero.model;

public class RegisterModel {

	private String strFirstName;
	private String strLastName;
	private String strAddress;
	private String strPhoneNumber;
	private Boolean isMarried;
	
	public RegisterModel(String strFirstName, String strLastName, String strAddress, String strPhoneNumber,
			Boolean isMarried) {
		super();
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddress = strAddress;
		this.strPhoneNumber = strPhoneNumber;
		this.isMarried = isMarried;
	}
	
	public String getStrFirstName() {
		return strFirstName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public String getStrAddress() {
		return strAddress;
	}
	public String getStrPhoneNumber() {
		return strPhoneNumber;
	}
	public Boolean getIsMarried() {
		return isMarried;
	}	
	
}
