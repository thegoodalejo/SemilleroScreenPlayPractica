package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final Target TXT_USERNAME = Target.the("Campo para el usuario").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Campo para la contraseña").located(By.name("password"));
	public static final Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//input[@value='Log In']");

}
