package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class StoreLogin {

	public static final Target TXT_USERNAME = Target.the("User name field").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Password field").located(By.name("password"));
	public static final Target BTN_LOGIN = Target.the("Login button").located(By.name("signon"));
}
