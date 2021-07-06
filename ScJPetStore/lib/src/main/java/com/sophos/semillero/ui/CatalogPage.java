package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").locatedBy("//div[@id='WelcomeContent']");	
	public static final Target BTN_SIGN_IN =Target.the("Boton carrito").locatedBy("a[text()='Sign In']");
	public static final Target BTN_CART =Target.the("Boton carrito").locatedBy("//div[@id='MenuContent']//a[1]");
	public static final Target BTN_SIGN_OUT = Target.the("Boton sign out").locatedBy("a[text()='Sign Out']");	
	public static final Target BTN_MY_ACCOUNT = Target.the("Boton my account").locatedBy("//a[text()='My Account']");	

}
