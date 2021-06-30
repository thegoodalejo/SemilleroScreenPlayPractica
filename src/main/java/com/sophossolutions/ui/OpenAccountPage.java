package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class OpenAccountPage {

	public static final Target LINK_CREATE_ACCOUNT = Target.the("Link Open New Account").locatedBy("//a[@href='/parabank/openaccount.htm']");
	public static final Target LIST_TIPO_CUENTA = Target.the("lista tipo de cuenta").locatedBy("//select[@id='type']");
	public static final Target LIST_CUENTA_EXISTENTE = Target.the("Lista cuenta existente").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_OPEN_NEW_ACCOUNT = Target.the("Boton Open New Account").locatedBy("//input[@type='submit']");

}
