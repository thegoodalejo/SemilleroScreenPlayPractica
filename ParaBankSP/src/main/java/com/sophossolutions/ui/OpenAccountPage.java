package com.sophossolutions.ui;


import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class OpenAccountPage {
	
	public static final Target SELECT_TYPE = Target.the("Escoger tipo de cuenta").located(By.id("type"));
	public static final Target SELECT_ACCOUNT = Target.the("Escoger cuenta").located(By.id("fromAccountId"));
	public static final Target ACCOUNT_OPTIONS = Target.the("Cuentas disponibles").locatedBy("//select[@id='fromAccountId']/option");
	public static final Target BTN_OPEN_NEW = Target.the("Boton Abrir cuenta nueva").locatedBy("//input[@value='Open New Account']");
	public static final Target NUMERO_CUENTA = Target.the("Numero de la cuenta").located(By.id("newAccountId"));
	
}
