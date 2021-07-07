package com.sophos.semillero.model;

public class UserJPetStore {
	
	private String strFirstName;
	private String strLastName;
	private String strAddress1;
	private String strEmail;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	private String strPhone;
	private String strFavouriteCategory;

	
	public UserJPetStore(String[] strValue) {
		this.strFirstName = strValue[0];
		this.strLastName = strValue[1];
		this.strAddress1 = strValue[2];
		this.strEmail = strValue[3];
		this.strAddress2 = strValue[4];
		this.strCity = strValue[5];
		this.strState = strValue[6];
		this.strZip = strValue[7];
		this.strCountry = strValue[8];
		this.strPhone = strValue[9];
		this.strFavouriteCategory = strValue[10];
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

	public String getStrEmail() {
		return strEmail;
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

	public String getStrPhone() {
		return strPhone;
	}


	public String getStrFavouriteCategory() {
		return strFavouriteCategory;
	}
	
}
