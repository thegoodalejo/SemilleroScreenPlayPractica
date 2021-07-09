package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ReceiptPage {

	public static final Target TXT_CARD_TYPE = Target.the("Card type text").locatedBy("//tr[3]/td[2]");
	public static final Target TXT_CARD_NUMBER = Target.the("Card number text").locatedBy("//tr[4]/td[2]");
	public static final Target TXT_CARD_EXPIRY_DATE = Target.the("Card expiry date text").locatedBy("//tr[5]/td[2]");
	public static final Target TXT_BILLING_FIRST_NAME = Target.the("Billing first name text")
			.locatedBy("//tr[7]/td[2]");
	public static final Target TXT_BILLING_LAST_NAME = Target.the("Billing last name text").locatedBy("//tr[8]/td[2]");
	public static final Target TXT_BILLING_ADDRESS_1 = Target.the("Billing address 1 text").locatedBy("//tr[9]/td[2]");
	public static final Target TXT_BILLING_ADDRESS_2 = Target.the("Billing address 2 text").locatedBy("//tr[10]/td[2]");
	public static final Target TXT_BILLING_CITY = Target.the("Billing city text").locatedBy("//tr[11]/td[2]");
	public static final Target TXT_BILLING_STATE = Target.the("Billing state text").locatedBy("//tr[12]/td[2]");
	public static final Target TXT_BILLING_ZIP = Target.the("Billing zip code text").locatedBy("//tr[13]/td[2]");
	public static final Target TXT_BILLING_COUNTRY = Target.the("Billing country text").locatedBy("//tr[14]/td[2]");
	public static final Target TXT_SHIPPING_FIRST_NAME = Target.the("Shipping first name text")
			.locatedBy("//tr[16]/td[2]");
	public static final Target TXT_SHIPPING_LAST_NAME = Target.the("Shipping last name text")
			.locatedBy("//tr[17]/td[2]");
	public static final Target TXT_SHIPPING_ADDRESS_1 = Target.the("Shipping address 1 text")
			.locatedBy("//tr[18]/td[2]");
	public static final Target TXT_SHIPPING_ADDRESS_2 = Target.the("Shipping address 2 text")
			.locatedBy("//tr[19]/td[2]");
	public static final Target TXT_SHIPPING_CITY = Target.the("Shipping city text").locatedBy("//tr[20]/td[2]");
	public static final Target TXT_SHIPPING_STATE = Target.the("Shipping state text").locatedBy("//tr[21]/td[2]");
	public static final Target TXT_SHIPPING_ZIP = Target.the("Shipping zip code text").locatedBy("//tr[22]/td[2]");
	public static final Target TXT_SHIPPING_COUNTRY = Target.the("Shipping country text").locatedBy("//tr[23]/td[2]");

	public static final Target ROW_GENERATED_DETAILS = Target.the("Generated order details row")
			.locatedBy("(//tbody//th)[1]");
	public static final Target ROW_RECEIPT_ELEMENTS = Target.the("Receipt elements row")
			.locatedBy("//td[@colspan='2']//tr[position()>1 and position()<last()]");

	public static final Target BTN_CONFIRM = Target.the("Return to main menu button")
			.locatedBy("//*[text()='Return to Main Menu']");

	private static final String STR_ITEM_SELECTOR = "//td[@colspan='2']//tr[position()>1 and position()<last()][%d]";

	public static Target getItemId(int i) {
		return Target.the("Item ID").locatedBy(String.format(STR_ITEM_SELECTOR, i) + "/td[1]/a");
	}

	public static Target getItemDescription(int i) {
		return Target.the("Item description").locatedBy(String.format(STR_ITEM_SELECTOR, i) + "/td[2]");
	}

	public static Target getItemQuantity(int i) {
		return Target.the("Item quantity").locatedBy(String.format(STR_ITEM_SELECTOR, i) + "/td[3]");
	}

	public static Target getItemPrice(int i) {
		return Target.the("Item price").locatedBy(String.format(STR_ITEM_SELECTOR, i) + "/td[4]");
	}

}
