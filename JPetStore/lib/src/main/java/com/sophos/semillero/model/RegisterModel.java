package com.sophos.semillero.model;

public class RegisterModel {

	private String strUser;
	private String strPassword;
	private String strFirstName;
	private String strLastName;
	private String strEmail;
	private int intPhone;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private int intZip;
	private String strCountry;
		
	public RegisterModel(String strUser, String strPassword, String strFirstName, String strLastName, String strEmail,
			int intPhone, String strAddress1, String strAddress2, String strCity, String strState, int intZip,
			String strCountry) {
		this.strUser = strUser;
		this.strPassword = strPassword;
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strEmail = strEmail;
		this.intPhone = intPhone;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.intZip = intZip;
		this.strCountry = strCountry;
	}



	public String getStrUser() {
		return strUser;
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

	public int getIntPhone() {
		return intPhone;
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

	public int getIntZip() {
		return intZip;
	}

	public String getStrCountry() {
		return strCountry;
	}
	
}
