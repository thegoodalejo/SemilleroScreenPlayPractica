package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

	public static final Target TXT_EMPTY_CART = Target.the("Empty cart message").locatedBy("//*[text()='Your cart is empty.']");
	
	public static final Target BTN_UPDATE_CART = Target.the("Update cart button").locatedBy("//*[@name='updateCartQuantities']");
	public static final Target BTN_REMOVE_ITEM = Target.the("Remove item button").locatedBy("//*[@href='/actions/Cart.action?removeItemFromCart=&workingItemId={0}']");
	public static final Target BTN_CHECKOUT = Target.the("Proceed to checkout button").locatedBy("//*[text()='Proceed to Checkout']");
	
}
