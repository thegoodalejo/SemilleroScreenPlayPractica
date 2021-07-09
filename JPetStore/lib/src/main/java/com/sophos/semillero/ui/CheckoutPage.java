package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

	public static final Target FORM_CARD_TYPE = Target.the("Card type form").locatedBy("//*[@name='order.cardType']");
	
	public static final Target TXT_CARD_NUMBER = Target.the("Card number field").locatedBy("//*[@name='order.cardType']");
	public static final Target TXT_CARD_EXPIRY_DATE = Target.the("Card expiry date field").locatedBy("//*[@name='order.expiryDate']");
	public static final Target TXT_FIRST_NAME = Target.the("First name field").locatedBy("//*[@name='order.billToFirstName']");
	public static final Target TXT_LAST_NAME = Target.the("Last name field").locatedBy("//*[@name='order.billToLastName']");
	public static final Target TXT_ADDRESS_1 = Target.the("Address 1 field").locatedBy("//*[@name='order.billAddress1']");
	public static final Target TXT_ADDRESS_2 = Target.the("Address 2 field").locatedBy("//*[@name='order.billAddress2']");
	public static final Target TXT_CITY = Target.the("City field").locatedBy("//*[@name='order.billCity']");
	public static final Target TXT_STATE = Target.the("State field").locatedBy("//*[@name='order.billState']");
	public static final Target TXT_ZIP = Target.the("Zip code field").locatedBy("//*[@name='order.billZip']");
	public static final Target TXT_COUNTRY = Target.the("Country field").locatedBy("//*[@name='order.billCountry']");
	
	public static final Target BTN_CONTINUE = Target.the("Continue button").locatedBy("//*[@name='newOrder']");
	
}
