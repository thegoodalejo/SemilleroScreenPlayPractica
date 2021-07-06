package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target TXT_USER_NAME= Target.the("Campo nombre de usuario").locatedBy("//input[@name='username']");
	public static final Target TXT_PASSWORD=Target.the("Campo contrase�a").located(By.name("password"));
	public static final Target BTN_LOGIN=Target.the("Boton login").locatedBy("//input[@name='signon']");	
	public static final Target BTN_REGISTER= Target.the("Bot�n para registrarse").locatedBy("//a[text()='Register Now!']");

}