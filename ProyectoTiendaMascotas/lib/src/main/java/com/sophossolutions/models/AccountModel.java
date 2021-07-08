package com.sophossolutions.models;

public class AccountModel {
	
	private String strFirstName;
	private String strLastName;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	
	public AccountModel( String strFirstName, String strLastName, String strAddress1, String strAddress2, String strCity, String strState,
			String strZip, String strCountry) {
		
		super();
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
	}

	public String getStrFirstName() {
		return strFirstName;
	}

	public String getStrLastName() {
		return strLastName;
	}

	public String getStrAddress1() {
		return strAddress1;
	}

	public String getStrAddress2() {
		return strAddress2;
	}

	public String getStrCity() {
		return strCity;
	}

	public String getStrState() {
		return strState;
	}

	public String getStrZip() {
		return strZip;
	}

	public String getStrCountry() {
		return strCountry;
	}

	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}

	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}

	public void setStrAddress1(String strAddress1) {
		this.strAddress1 = strAddress1;
	}

	public void setStrAddress2(String strAddress2) {
		this.strAddress2 = strAddress2;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public void setStrState(String strState) {
		this.strState = strState;
	}

	public void setStrZip(String strZip) {
		this.strZip = strZip;
	}

	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}
}
