package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPages {
	public static final Target BTN_CHECKOUT = Target.the("Checkout button").locatedBy("//a[text()='Proceed to Checkout']");
	public static final Target BTN_CONTINUE = Target.the("Continue button").locatedBy("//input[@name='newOrder']");
	public static final Target TABLE_USER_DATA = Target.the("Table user data").locatedBy("//tr[position()>2 and position() < 10][{0}]//td[2]");
	public static final Target BTN_CONFIRM = Target.the("Confirm button").locatedBy("//a[@class='Button']");
	
	
}
