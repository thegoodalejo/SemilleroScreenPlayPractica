package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class StoreCar {
	public static final Target PET_SELECTED = Target.the("Pet Select").locatedBy("//*[contains(text(), '{0}')]");
	public static final Target BTN_REMOVE = Target.the("Pet Remove").locatedBy("//td[contains(text(), '{0}')]//ancestor::tr//a[@class]");
	public static final Target TXT_QUANTITY = Target.the("Quantity of pets").locatedBy("//tr[position()>1 and position() < last()]//td[5]");
	public static final Target BTN_UPDATE = Target.the("Update Quantity").located(By.name("updateCartQuantities"));
	public static final Target BTN_SHOPPINGCAR = Target.the("Shopping car button").locatedBy("//a[contains(@href, 'Cart.action')]");
	public static final Target LIST_PETSCAR = Target.the("Pet listing shopping cart").locatedBy("//tr[position()>1 and position() < last()]");
	public static final Target BTN_CHECKOUT = Target.the("Button proceed to checkout").locatedBy("//a[contains(@href,'Order.action')]");
}

