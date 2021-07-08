package com.sophos.semillero.model;

public class UserJPetStore {
	
	private String strFirstName;
	private String strLastName;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;

	public UserJPetStore(String strFirstName, String strLastName, String strAddress1, String strAddress2,
			String strCity, String strState, String strZip) {
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
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
	
}
