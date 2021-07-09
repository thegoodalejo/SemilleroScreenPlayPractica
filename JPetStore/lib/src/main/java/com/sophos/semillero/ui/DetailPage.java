package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetailPage {

	public static final Target BTN_ADD_TO_CART = Target.the("Add to cart button").locatedBy("//a[@class='Button']");
	public static final Target TXT_ITEM_ID = Target.the("Item ID text").locatedBy("//tr[2]/td/b");
}
