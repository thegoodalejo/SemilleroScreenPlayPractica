package com.grupo3.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_USERNAME = Target.the("Username Input field").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Password Input field").located(By.name("password"));
	public static final Target BTN_LOGIN = Target.the("Login button").located(By.name("signon"));
	
}
