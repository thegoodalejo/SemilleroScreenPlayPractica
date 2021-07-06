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
	private String strLenguage;
	private String strFavouriteCategory;
	private boolean isEnableMyList;
	private boolean isEnableMyBanner;
	
	public UserJPetStore(String strFirstName, String strLastName, String strAddress1, String strEmail,
			String strAddress2, String strCity, String strState, String strZip, String strCountry, String strPhone,
			String strLenguage, String strFavouriteCategory, boolean isEnableMyList, boolean isEnableMyBanner) {
		super();
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddress1 = strAddress1;
		this.strEmail = strEmail;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
		this.strPhone = strPhone;
		this.strLenguage = strLenguage;
		this.strFavouriteCategory = strFavouriteCategory;
		this.isEnableMyList = isEnableMyList;
		this.isEnableMyBanner = isEnableMyBanner;
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

	public String getStrLenguage() {
		return strLenguage;
	}

	public String getStrFavouriteCategory() {
		return strFavouriteCategory;
	}

	public boolean isEnableMyList() {
		return isEnableMyList;
	}

	public boolean isEnableMyBanner() {
		return isEnableMyBanner;
	}
	
}
