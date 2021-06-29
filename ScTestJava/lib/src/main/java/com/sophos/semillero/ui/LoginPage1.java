package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage1 {
	
	public static final Target TXT_USER_NAME= Target.the("Campo nombre de usuario").locatedBy("//input[@name='username']");
	public static final Target TXT_PASSWORD=Target.the("Campo contraseña").locatedBy("//input[@name='password']");
	public static final Target BTN_LOGIN=Target.the("Boton login").locatedBy("//input[@value='Log In']");
	
}
