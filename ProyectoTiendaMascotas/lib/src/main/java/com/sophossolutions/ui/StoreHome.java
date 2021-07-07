package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class StoreHome {
	public static final Target PET_TYPE = Target.the("PET TYPE").locatedBy("//a[contains(@href, '{0}')]");
	public static final Target PET_BREED = Target.the("PET BREED").locatedBy("//td[contains(text(), '{0}')]//parent::*//a");
	public static final Target PET_SELECT = Target.the("PET SELECT").locatedBy("//td[contains(text(), '{0}')]//ancestor::tr//td[1]");
	public static final Target BTN_ADD = Target.the("PET BREED").locatedBy("//td[contains(text(), '{0}')]//parent::*//a[@class='Button']");
	public static final Target TXT_WELCOME = Target.the("WELCOME TEXT").located(By.id("WelcomeContent"));
	public static final Target BTN_HOME = Target.the("Button home pet store").locatedBy("//div[@id='LogoContent']//a");

}
