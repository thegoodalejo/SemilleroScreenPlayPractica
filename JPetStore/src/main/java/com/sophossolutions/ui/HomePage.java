package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage 
{
	public static final Target LINK_TEXT_SIGN_IN = Target.the("Link for sign user").locatedBy("//a[contains(text(),'Sign In')]");
	public static final Target TXT_WELCOME = Target.the("Text for user logged").locatedBy("//div[contains(text(),'Welcome')]");
	public static final Target LINKS_ANIMALS = Target.the("Link to go animal").locatedBy("//div[@id='QuickLinks']//a");
	public static final Target LINK_ANIMAL = Target.the("Link to go animal").locatedBy("(//div[@id='QuickLinks']//a)[{0}]");
}