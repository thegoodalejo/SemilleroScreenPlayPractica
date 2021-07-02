package com.sophossolutions.models;

public class RegisterModel {
	
	private String strFirstName;
	private String strLastName;
	private String strAddress;
	private String strCity;
	private String strState;
	private String strZipCode;
	private String strPhone;
	private boolean isMarried;
	

	public RegisterModel(String strFirstName, String strLastName, String strAddress, String strCity, String strState,
			String strZipCode, String strPhone, boolean isMarried) {
		super();
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddress = strAddress;
		this.strCity = strCity;
		this.strState = strState;
		this.strZipCode = strZipCode;
		this.strPhone = strPhone;
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

	public String getStrCity() {
		return strCity;
	}

	public String getStrState() {
		return strState;
	}

	public String getStrZipCode() {
		return strZipCode;
	}

	public String getStrPhone() {
		return strPhone;
	}
	public boolean getIsMarried() {
		return isMarried;
	}

	
	

	
}
