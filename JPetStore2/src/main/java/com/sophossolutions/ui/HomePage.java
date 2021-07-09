package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	
	public static final Target TXT_LOGGEDIN = Target.the("Logged in message").locatedBy("//*[text()='Sign Out']");
	public static final Target BTN_LOGIN = Target.the("Log in button").locatedBy("//*[text()='Sign In']");
	public static final Target IMG_HOME = Target.the("Go to home page button").locatedBy("//div[@id='Logo']");
	public static final Target IMG_CART = Target.the("Shopping cart button").locatedBy("//img[@name='img_cart']");
	
	public static final Target IMG_CATEGORY_FISH = Target.the("Category Fish").locatedBy("//div[@id='QuickLinks']//a[1]");
	public static final Target IMG_CATEGORY_DOGS = Target.the("Category Dogs").locatedBy("//div[@id='QuickLinks']//a[2]");
	public static final Target IMG_CATEGORY_REPTILES = Target.the("Category Reptiles").locatedBy("//div[@id='QuickLinks']//a[3]");
	public static final Target IMG_CATEGORY_CATS = Target.the("Category Cats").locatedBy("//div[@id='QuickLinks']//a[4]");
	public static final Target IMG_CATEGORY_BIRDS = Target.the("Category Birds").locatedBy("//div[@id='QuickLinks']//a[5]");

	public static final Target TXT_WELCOME = Target.the("Messaje Welcome").locatedBy("//div[contains(text(),'Welcome grupo!')]");
}
