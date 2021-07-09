package com.sophos.semillero.model;

import java.util.ArrayList;

public class OrderUserInfoModel {

	private String strFirstNameBilling;
	private String strLastNameBilling;
	private String strAddress1Billing;
	private String strAddress2Billing;
	private String strCityBilling;
	private String strStateBilling;
	private String strZipBilling;
	private String strCountryBilling;

	private String strFirstNameShipping;
	private String strLastNameShipping;
	private String strAddress1Shipping;
	private String strAddress2Shipping;
	private String strCityShipping;
	private String strStateShipping;
	private String strZipShipping;
	private String strCountryShipping;

	public OrderUserInfoModel(String strFirstNameBilling, String strLastNameBilling, String strAddress1Billing,
			String strAddress2Billing, String strCityBilling, String strStateBilling, String strZipBilling,
			String strCountryBilling, String strFirstNameShipping, String strLastNameShipping,
			String strAddress1Shipping, String strAddress2Shipping, String strCityShipping, String strStateShipping,
			String strZipShipping, String strCountryShipping) {
		this.strFirstNameBilling = strFirstNameBilling;
		this.strLastNameBilling = strLastNameBilling;
		this.strAddress1Billing = strAddress1Billing;
		this.strAddress2Billing = strAddress2Billing;
		this.strCityBilling = strCityBilling;
		this.strStateBilling = strStateBilling;
		this.strZipBilling = strZipBilling;
		this.strCountryBilling = strCountryBilling;

		this.strFirstNameShipping = strFirstNameShipping;
		this.strLastNameShipping = strLastNameShipping;
		this.strAddress1Shipping = strAddress1Shipping;
		this.strAddress2Shipping = strAddress2Shipping;
		this.strCityShipping = strCityShipping;
		this.strStateShipping = strStateShipping;
		this.strZipShipping = strZipShipping;
		this.strCountryShipping = strCountryShipping;
	}

	public String getStrFirstNameBilling() {
		return strFirstNameBilling;
	}

	public String getStrLastNameBilling() {
		return strLastNameBilling;
	}

	public String getStrAddress1Billing() {
		return strAddress1Billing;
	}

	public String getStrAddress2Billing() {
		return strAddress2Billing;
	}

	public String getStrCityBilling() {
		return strCityBilling;
	}

	public String getStrStateBilling() {
		return strStateBilling;
	}

	public String getStrZipBilling() {
		return strZipBilling;
	}

	public String getStrCountryBilling() {
		return strCountryBilling;
	}

	public String getStrFirstNameShipping() {
		return strFirstNameShipping;
	}

	public String getStrLastNameShipping() {
		return strLastNameShipping;
	}

	public String getStrAddress1Shipping() {
		return strAddress1Shipping;
	}

	public String getStrAddress2Shipping() {
		return strAddress2Shipping;
	}

	public String getStrCityShipping() {
		return strCityShipping;
	}

	public String getStrStateShipping() {
		return strStateShipping;
	}

	public String getStrZipShipping() {
		return strZipShipping;
	}

	public String getStrCountryShipping() {
		return strCountryShipping;
	}
}
