package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ParabankLogin
{
	public static final Target TXT_USER = Target.the("Campo de usuario").locatedBy("//input[@name='username']");
	public static final Target TXT_PASSWORD = Target.the("Campo de usuario").locatedBy("//input[@name='password']");
	public static final Target BTN_LOGIN = Target.the("Boton de inicio de sesion ").locatedBy("//input[@value='Log In']");
	public static final Target VISIBLE_TABLE = Target.the("Tabla de cuentas al iniciar sesion").locatedBy("//h1[text()='Error!']");
}