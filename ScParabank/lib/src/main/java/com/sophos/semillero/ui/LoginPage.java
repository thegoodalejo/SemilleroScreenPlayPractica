package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_LOGIN_MSG = Target.the("Login message").locatedBy("//*[text()='Customer Login']");
	public static final Target TXT_USERNAME = Target.the("Username field").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Username field").located(By.name("password"));
	public static final Target BTN_LOGIN = Target.the("Botón login").locatedBy("//*[@value='Log In']");

}
