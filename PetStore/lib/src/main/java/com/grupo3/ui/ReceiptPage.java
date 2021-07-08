package com.grupo3.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ReceiptPage {
	
	public static final Target RECEIPT_GENERATED_DETAILS = Target.the("").locatedBy("(//tbody//th)[1]");
	
	public static final Target BILLING_ADDR_FNAME = Target.the("").locatedBy("//tr[7]/td[2]");
	public static final Target BILLING_ADDR_LNAME = Target.the("").locatedBy("//tr[8]/td[2]");
	public static final Target BILLING_ADDR_1 = Target.the("").locatedBy("//tr[9]/td[2]");
	public static final Target BILLING_ADDR_2 = Target.the("").locatedBy("//tr[10]/td[2]");
	public static final Target BILLING_ADDR_CITY = Target.the("").locatedBy("//tr[11]/td[2]");
	public static final Target BILLING_ADDR_STATE = Target.the("").locatedBy("//tr[12]/td[2]");
	public static final Target BILLING_ADDR_ZIP_CODE = Target.the("").locatedBy("//tr[13]/td[2]");
	public static final Target BILLING_ADDR_COUNTRY = Target.the("").locatedBy("//tr[14]/td[2]");
	
	public static final Target SHIPPING_ADDR_FNAME = Target.the("").locatedBy("//tr[16]/td[2]");
	public static final Target SHIPPING_ADDR_LNAME = Target.the("").locatedBy("//tr[17]/td[2]");
	public static final Target SHIPPING_ADDR_1 = Target.the("").locatedBy("//tr[18]/td[2]");
	public static final Target SHIPPING_ADDR_2 = Target.the("").locatedBy("//tr[19]/td[2]");
	public static final Target SHIPPING_ADDR_CITY = Target.the("").locatedBy("//tr[20]/td[2]");
	public static final Target SHIPPING_ADDR_STATE = Target.the("").locatedBy("//tr[21]/td[2]");
	public static final Target SHIPPING_ADDR_ZIP_CODE = Target.the("").locatedBy("//tr[22]/td[2]");
	public static final Target SHIPPING_ADDR_COUNTRY = Target.the("").locatedBy("//tr[23]/td[2]");
	
	public static final Target CARD_TYPE = Target.the("").locatedBy("//tr[3]/td[2]");
	public static final Target CARD_NUMBER = Target.the("").locatedBy("//tr[4]/td[2]");
	public static final Target CARD_EXPIRY = Target.the("").locatedBy("//tr[5]/td[2]");
	
	public static final Target RECEIPT_ELEMENTS = Target.the("").locatedBy("//td[@colspan='2']//tr[position()>1 and position()<last()]");

	private static final String ELEMENT_SELECTOR = "//td[@colspan='2']//tr[position()>1 and position()<last()][%d]";
	
	public static Target getElementID(int i) {
		return Target.the("").locatedBy(String.format(ELEMENT_SELECTOR, i) + "/td[1]/a");
	}

	public static Target getElementDescription(int i) {
		return Target.the("").locatedBy(String.format(ELEMENT_SELECTOR, i) + "/td[2]");
	}
	
	public static Target getElementQuantity(int i) {
		return Target.the("").locatedBy(String.format(ELEMENT_SELECTOR, i) + "/td[3]");
	}

	public static Target getElementPrice(int i) {
		return Target.the("").locatedBy(String.format(ELEMENT_SELECTOR, i) + "/td[4]");
	}
	
	
}
