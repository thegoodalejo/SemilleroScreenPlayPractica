package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {
	public static final Target BTN_REGISTER = Target.the("Register new user").locatedBy("//ul[@class='nav navbar-nav']//a[contains(text(),'Join Today')]");
}
