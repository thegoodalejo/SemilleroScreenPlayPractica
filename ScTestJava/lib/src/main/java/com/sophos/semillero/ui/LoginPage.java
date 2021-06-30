package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_USER_NAME= Target.the("Campo nombre de usuario").locatedBy("//input[@name='username']");
	public static final Target TXT_PASSWORD=Target.the("Campo contraseña").locatedBy("//input[@name='password']");
	public static final Target BTN_LOGIN=Target.the("Boton login").locatedBy("//input[@value='Log In']");
	
	// tempotalmente se usa titulo de error debido a la perdida del acceso a la pagina 
	public static final Target LOGIN_TABLE=Target.the("Boton login").locatedBy("//h1[text()='Error!']");
	
	
}
