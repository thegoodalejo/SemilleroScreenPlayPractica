package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetailPage {

	public static final Target BTN_ADD_CART = Target.the("Button Add Cart").locatedBy("//a[@class='Button']");
	public static final Target ID_ITEM = Target.the("ID Item").locatedBy("//tbody//tr[2]//td[1]//b");
}
