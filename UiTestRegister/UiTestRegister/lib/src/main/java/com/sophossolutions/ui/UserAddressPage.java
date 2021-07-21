package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserAddressPage {
	static public final Target EDIT_TEXT_CITY = Target.the("Edit text City").locatedBy("//input[@id='city']");
	static public final Target EDIT_TEXT_ZIP_CODE = Target.the("Edit text zip code").locatedBy("//input[@id='zip']");
	static public final Target BTN_NEXT = Target.the("Button to next").locatedBy("//a[@class='btn btn-blue pull-right']");
	static public final Target OPTION_CITY = Target.the("Option city").locatedBy("//div[@class='pac-item']");
}
