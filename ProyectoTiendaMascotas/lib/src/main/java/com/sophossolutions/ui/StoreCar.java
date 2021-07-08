package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class StoreCar {
	public static final Target PET_SELECTED = Target.the("Pet Select").locatedBy("//*[contains(text(), '{0}')]");
	public static final Target BTN_REMOVE = Target.the("Pet Remove").locatedBy("//td[contains(text(), '{0}')]//ancestor::tr//a[@class]");
	public static final Target TXT_QUANTITY = Target.the("Quantity of pets").locatedBy("//tr[position()>1 and position() < last()]//td[5]/input");
	public static final Target TXT_PRICE = Target.the("Price per pet").locatedBy("//tr[position()>1 and position() < last()]//td[6]");
	public static final Target TXT_COSTTOTAL = Target.the("Cost total").locatedBy("//tr[position()>1 and position() < last()]//td[7]");
	public static final Target BTN_UPDATE = Target.the("Update Quantity").located(By.name("updateCartQuantities"));
	public static final Target BTN_SHOPPINGCAR = Target.the("Shopping car button").locatedBy("//a[contains(@href, 'Cart.action')]");
	public static final Target LIST_PETSCAR = Target.the("Pet listing shopping cart").locatedBy("//tr[position()>1 and position() < last()]");
	public static final Target TEXT_PETSCAR = Target.the("Pet listing shopping cart").locatedBy("//tr[position()>1 and position() < last()][{0}]//td");
	public static final Target TEXT_QUANTITIES = Target.the("Pet listing shopping cart").locatedBy("//tr[position()>1 and position() < last()][{0}]//td/input");
	public static final Target BTN_CHECKOUT = Target.the("Button proceed to checkout").locatedBy("//a[contains(@href,'Order.action')]");
	public static final Target BTN_CONTINUE = Target.the("Button continue with the buy").located(By.name("newOrder"));
	public static final Target BTN_CONFIRM = Target.the("Button confirm the buy").located(By.className("Button"));
	public static final Target BTN_MYACCOUNT = Target.the("Button my account").locatedBy("//a[contains(@href,'edit')]");
}

