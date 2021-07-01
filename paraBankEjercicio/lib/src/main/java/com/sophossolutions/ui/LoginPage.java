package com.sophossolutions.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final Target TXT_USER_NAME = Target.the("Campo donde se coloca el usuario").locatedBy("//input[@name ='username']");
	public static final Target TXT_USER_PASWORD = Target.the("Campo donde se coloca el usuario").locatedBy("//input[@name ='password']");
	public static final Target BTN_LOGIN = Target.the("Boton hacer el login ").located(By.xpath("//input[@value='Log In']"));
	
}
