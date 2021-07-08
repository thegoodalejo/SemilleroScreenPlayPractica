package com.grupo3.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
	
	public static Target CARD_TYPE_OPTION = Target.the("Card Type selector").locatedBy("//select[@name='order.cardType']/option[@selected]");
	public static Target TXT_CARD_NUMBER = Target.the("Card number input").locatedBy("//input[@name='order.creditCard']");
	public static Target TXT_CARD_EXPIRY = Target.the("Card expiry input").locatedBy("//input[@name='order.expiryDate']");
	public static Target TXT_FNAME = Target.the("First Name input").locatedBy("//input[@name='order.billToFirstName']");
	public static Target TXT_LNAME = Target.the("Last Name input").locatedBy("//input[@name='order.billToLastName']");
	public static Target TXT_ADDR_1 = Target.the("Address 1 input").locatedBy("//input[@name='order.billAddress1']");
	public static Target TXT_ADDR_2 = Target.the("Address 2 input").locatedBy("//input[@name='order.billAddress2']");
	public static Target TXT_CITY = Target.the("City input").locatedBy("//input[@name='order.billCity']");
	public static Target TXT_STATE = Target.the("State input").locatedBy("//input[@name='order.billState']");
	public static Target TXT_ZIP_CODE = Target.the("Zip Code input").locatedBy("//input[@name='order.billZip']");
	public static Target TXT_COUNTRY = Target.the("Country input").locatedBy("//input[@name='order.billCountry']");
	public static Target SEL_SHIP_TO_OTHER_ADDRESS = Target.the("Different Address Selector").locatedBy("//input[@name='shippingAddressRequired']");
	public static Target BTN_CONTINUE = Target.the("Submit Button").locatedBy("//input[@name='newOrder']");
	
}
