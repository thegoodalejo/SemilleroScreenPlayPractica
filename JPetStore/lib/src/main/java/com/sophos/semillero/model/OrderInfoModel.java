package com.sophos.semillero.model;

import com.sophos.semillero.ui.CheckoutPage;

import net.serenitybdd.screenplay.Actor;

public class OrderInfoModel {

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

	public OrderInfoModel(String strFirstNameBilling, String strLastNameBilling, String strAddress1Billing,
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
	
	public OrderInfoModel (Actor actor) {
		this.strFirstNameBilling = CheckoutPage.TXT_FIRST_NAME.resolveFor(actor).getValue();
		this.strLastNameBilling = CheckoutPage.TXT_LAST_NAME.resolveFor(actor).getValue();
		this.strAddress1Billing = CheckoutPage.TXT_ADDRESS_1.resolveFor(actor).getValue();
		this.strAddress2Billing = CheckoutPage.TXT_ADDRESS_2.resolveFor(actor).getValue();
		this.strCityBilling = CheckoutPage.TXT_CITY.resolveFor(actor).getValue();
		this.strStateBilling = CheckoutPage.TXT_STATE.resolveFor(actor).getValue();
		this.strZipBilling = CheckoutPage.TXT_ZIP.resolveFor(actor).getValue();
		this.strCountryBilling = CheckoutPage.TXT_COUNTRY.resolveFor(actor).getValue();
		
		this.strFirstNameShipping = this.strFirstNameBilling;
		this.strLastNameShipping = this.strLastNameBilling;
		this.strAddress1Shipping = this.strAddress1Billing;
		this.strAddress2Shipping = this.strAddress2Billing;
		this.strCityShipping = this.strCityBilling;
		this.strStateShipping = this.strStateBilling;
		this.strZipShipping = this.strZipBilling;
		this.strCountryShipping = this.strCountryBilling;		
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
