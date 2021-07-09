package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ItemsPage {
	
	public static final Target BTN_ADD_TO_CART = Target.the("Item a seleccionar").locatedBy("//a[contains(@href, '{0}') and text()='Add to Cart']");
	public static final Target BTN_ITEM_ID = Target.the("Item a seleccionar").locatedBy("//a[contains(@href, '{0}')]");

}