package com.sophossolutions.models;

public class RegisterModel {
	
	private String strUserName;
	private String strPassword;
	private String strFirstName;
	private String strLastName;
	private String strEmail;
	private String strPhone;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	private String strLanguage;
	private String strFavouriteCategory;
	private boolean enableMyList;
	private boolean enableMyBanner;
	
	public RegisterModel(String strUserName, String strPassword, String strFirstName, String strLastName,
			String strEmail, String strPhone, String strAddress1, String strAddress2, String strCity, String strState,
			String strZip, String strCountry, String strLanguage, String strFavouriteCategory, boolean enableMyList,
			boolean enableMyBanner) {
		super();
		this.strUserName = strUserName;
		this.strPassword = strPassword;
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strEmail = strEmail;
		this.strPhone = strPhone;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
		this.strLanguage = strLanguage;
		this.strFavouriteCategory = strFavouriteCategory;
		this.enableMyList = enableMyList;
		this.enableMyBanner = enableMyBanner;
	}
	
	
	public RegisterModel( String strFirstName, String strLastName, String strAddress1, String strAddress2, String strCity, String strState,
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

	public String getStrUserName() {
		return strUserName;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public String getStrFirstName() {
		return strFirstName;
	}

	public String getStrLastName() {
		return strLastName;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public String getStrPhone() {
		return strPhone;
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

	public String getStrLanguage() {
		return strLanguage;
	}

	public String getStrFavouriteCategory() {
		return strFavouriteCategory;
	}

	public boolean isEnableMyList() {
		return enableMyList;
	}

	public boolean isEnableMyBanner() {
		return enableMyBanner;
	}
	
	

}
