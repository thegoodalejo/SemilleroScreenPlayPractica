package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmOrderPage {

	public static final Target TXT_ORDER_DATE = Target.the("Order date text").locatedBy("//font[2]/b");
	public static final Target TXT_BILLING_FIRST_NAME = Target.the("Billing first name text")
			.locatedBy("//tr[3]/td[2]");
	public static final Target TXT_BILLING_LAST_NAME = Target.the("Billing last name text").locatedBy("//tr[4]/td[2]");
	public static final Target TXT_BILLING_ADDRESS_1 = Target.the("Billing address 1 text").locatedBy("//tr[5]/td[2]");
	public static final Target TXT_BILLING_ADDRESS_2 = Target.the("Billing address 2 text").locatedBy("//tr[6]/td[2]");
	public static final Target TXT_BILLING_CITY = Target.the("Billing city text").locatedBy("//tr[7]/td[2]");
	public static final Target TXT_BILLING_STATE = Target.the("Billing state text").locatedBy("//tr[8]/td[2]");
	public static final Target TXT_BILLING_ZIP = Target.the("Billing zip code text").locatedBy("//tr[9]/td[2]");
	public static final Target TXT_BILLING_COUNTRY = Target.the("Billing country text").locatedBy("//tr[10]/td[2]");
	public static final Target TXT_SHIPPING_FIRST_NAME = Target.the("Shipping first name text")
			.locatedBy("//tr[12]/td[2]");
	public static final Target TXT_SHIPPING_LAST_NAME = Target.the("Shipping last name text")
			.locatedBy("//tr[13]/td[2]");
	public static final Target TXT_SHIPPING_ADDRESS_1 = Target.the("Shipping address 1 text")
			.locatedBy("//tr[14]/td[2]");
	public static final Target TXT_SHIPPING_ADDRESS_2 = Target.the("Shipping address 2 text")
			.locatedBy("//tr[15]/td[2]");
	public static final Target TXT_SHIPPING_CITY = Target.the("Shipping city text").locatedBy("//tr[16]/td[2]");
	public static final Target TXT_SHIPPING_STATE = Target.the("Shipping state text").locatedBy("//tr[17]/td[2]");
	public static final Target TXT_SHIPPING_ZIP = Target.the("Shipping zip code text").locatedBy("//tr[18]/td[2]");
	public static final Target TXT_SHIPPING_COUNTRY = Target.the("Shipping country text").locatedBy("//tr[19]/td[2]");

	public static final Target BTN_CONFIRM = Target.the("Confirm button").locatedBy("//*[text()='Confirm']");

}
