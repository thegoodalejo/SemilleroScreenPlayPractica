package com.grupo3.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
	
	public static final Target OPTIONS_IN_MENU = Target.the("Option menu").locatedBy("//div[@id='MenuContent']/a");
	public static final Target CATEGORIES = Target.the("Categories").locatedBy("//div[@id='SidebarContent']/a");
	
}
