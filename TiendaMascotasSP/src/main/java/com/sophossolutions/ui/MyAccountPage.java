package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
	
	public static final Target TXT_FIRSTNAME = Target.the("Campo para nombre").locatedBy("//input[@name='account.firstName']");
	public static final Target TXT_LASTNAME = Target.the("Campo para apellido").located(By.name("account.lastName"));
	public static final Target TXT_EMAIL = Target.the("Campo para correo").located(By.name("account.email"));
	public static final Target TXT_PHONE = Target.the("Campo para telefono").located(By.name("account.phone"));
	public static final Target TXT_ADDRESS = Target.the("Campo para direccion").located(By.name("account.address1"));
	public static final Target TXT_CITY = Target.the("Campo para Ciudad").located(By.name("account.city"));
	public static final Target TXT_STATE = Target.the("Campo para Estado ").located(By.name("account.state"));
	public static final Target TXT_ZIP = Target.the("Campo para Codigo Postal ").located(By.name("account.zip"));
	public static final Target TXT_COUNTRY = Target.the("Campo para Pais ").located(By.name("account.country"));

}
