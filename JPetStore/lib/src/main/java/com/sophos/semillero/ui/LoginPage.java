package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_USERNAME = Target.the("Username field").locatedBy("//*[@name='username']");
	public static final Target TXT_PASSWORD = Target.the("Password field").locatedBy("//*[@name='password']");
	public static final Target BTN_LOGIN = Target.the("Log in button").locatedBy("//*[@name='signon']");
	public static final Target BTN_REGISTER = Target.the("Register page button").locatedBy("//*[text()='Register Now!']");

}
