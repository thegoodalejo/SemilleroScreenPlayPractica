package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target TXT_LOGGED_IN = Target.the("Logged in message").locatedBy("//*[@id='WelcomeContent']");
	
	public static final Target BTN_SIGN_OUT = Target.the("Sign out button").locatedBy("//*[text()='Sign Out']");
	public static final Target BTN_LOGIN = Target.the("Log in button").locatedBy("//*[text()='Sign In']");
	public static final Target BTN_HOME = Target.the("Go to home page button").locatedBy("//*[@src='../images/logo-topbar.gif']");
	public static final Target BTN_CART = Target.the("Shopping cart button").locatedBy("//*[@name='img_cart']");
	public static final Target BTN_FISH = Target.the("Fish category button").locatedBy("//*[@src='../images/fish_icon.gif']");
	public static final Target BTN_DOGS = Target.the("Dogs category button").locatedBy("//*[@src='../images/dogs_icon.gif']");
	public static final Target BTN_CATS = Target.the("Cats category button").locatedBy("//*[@src='../images/cats_icon.gif']");
	public static final Target BTN_REPTILES = Target.the("Reptiles category button").locatedBy("//*[@src='../images/reptiles_icon.gif']");
	public static final Target BTN_BIRDS = Target.the("Birds category button").locatedBy("//*[@src='../images/birds_icon.gif']");
	
}
