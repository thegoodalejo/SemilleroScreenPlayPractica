package com.sophos.semillero.ui;



import net.serenitybdd.screenplay.targets.Target;

public class ParaBankLoginPage {

	
	public static final Target TXT_USER = Target.the("Campo del usuario").locatedBy("//input[@name='username']");
	public static final Target TXT_PASSWORD = Target.the("Campo de la contraseña").locatedBy("//input[@name='password']");
	public static final Target BTN_LOGIN = Target.the("Boton del log in").locatedBy("//input[@value='Log In']");
    

}
