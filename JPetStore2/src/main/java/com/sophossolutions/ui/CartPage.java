package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	
	public static final Target TXT_ID_ITEM = Target.the("ID Item Cart").locatedBy("//tbody//tr");
	public static final Target TXT_TITLE = Target.the("Title").locatedBy("//div/h2");
	public static final Target INPUT_CANT = Target.the("Campo cantidad").locatedBy("//td[5]//input");
	public static final Target TXT_PRICE = Target.the("Campo cantidad").locatedBy("//tr//td[6]");
	public static final Target TXT_TOTAL_COST = Target.the("Campo cantidad").locatedBy("//tr//td[7]");

	public static final Target BTN_UPDATE = Target.the("Button Update").locatedBy("//input[@name='updateCartQuantities']");
	

}
