package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_USER_NAME= Target.the("Campo nombre de usuario").locatedBy("name:uid");
	public static final Target TXT_PASSWORD=Target.the("Campo contraseña").located(By.name("password"));
	public static final Target BTN_LOGIN=Target.the("Boton login").locatedBy("//*[@value='LOGIN']");
	

}
