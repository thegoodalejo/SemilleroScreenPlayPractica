package com.sophossolutions.models;

public class DataUserCheckoutModel {
	private String strFirstName;
	private String strLastName;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	
	public DataUserCheckoutModel(String strFirstName, String strLastName, String strAddress1, String strAddress2,
			String strCity, String strState, String strZip, String strCountry){
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
	public void showModel() {
		String strBase = "|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|\n";
		System.out.println(
				String.format(strBase, "First Name", "Last Name", "Address 1", "Address 2", "City", "State", "Zip", "Country") +
				String.format(strBase, strFirstName, strLastName, strAddress1, strAddress2, strCity, strState, strZip, strCountry) 
		);
	}
}
