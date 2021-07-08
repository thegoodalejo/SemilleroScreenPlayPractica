package com.sophossolutions.model;

public class RegisterUser {
	
	private String strUserID;
	private String strNewPass;
	private String stFirstName;
	private String strLastName;
	private String strEmail;
	private String strPhone;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	
	public RegisterUser(String strUserID, String strNewPass, String stFirstName, String strLastName,
			String strEmail, String strPhone, String strAddress1, String strAddress2, String strCity, String strState,
			String strZip, String strCountry) {
		super();
		this.strUserID = strUserID;
		this.strNewPass = strNewPass;
		this.stFirstName = stFirstName;
		this.strLastName = strLastName;
		this.strEmail = strEmail;
		this.strPhone = strPhone;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
	}
	
	public RegisterUser(String stFirstName, String strLastName, String strAddress1, 
			String strCity, String strState, String strZip, String strCountry) {
		super();
		this.stFirstName = stFirstName;
		this.strLastName = strLastName;
		this.strAddress1 = strAddress1;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
	}

	public String getStrUserID() {
		return strUserID;
	}

	public String getStrNewPass() {
		return strNewPass;
	}

	public String getStFirstName() {
		return stFirstName;
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
	
}
