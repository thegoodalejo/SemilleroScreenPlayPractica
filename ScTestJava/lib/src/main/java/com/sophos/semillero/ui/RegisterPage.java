package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static final Target BTN_REGISTER = Target.the("Boton login").locatedBy("//a[text()='Open New Account']");
	public static final Target FORM_OPTIONS = Target.the("Tipo de Cuenta").locatedBy("//select[@id='type']");
	public static final Target FORM_NUMBER_OPTIONS = Target.the("Numero").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_OPEN = Target.the("Abrir cuenta").locatedBy("//input[@value='Open New Account']");

}