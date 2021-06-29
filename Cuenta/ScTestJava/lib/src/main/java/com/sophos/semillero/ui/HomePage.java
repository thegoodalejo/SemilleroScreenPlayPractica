package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	public static final Target TXT_USERNAME = Target.the("Campo nombre de usuario").locatedBy("//div[@class='login'][1]//input");
	public static final Target TXT_PASSWORD = Target.the("Campo nombre de contraseña").locatedBy("//div[@class='login'][2]//input");
	public static final Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//div[@class='login'][3]//input");
}
