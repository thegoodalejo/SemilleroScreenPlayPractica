package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OpenaccountPage {	
	
	public static final Target SELECT_TYPE_ACCOUNT = Target.the("Select con tipos de cuenta").locatedBy("//select[@id='type']");
	public static final Target SELECT_FROM_ACCOUNT = Target.the("Select con cuentas creadas").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_CREATE_NEW_ACCOUNT = Target.the("Boton nueva cuenta").locatedBy("//input[@type='submit']");
	public static final Target TXT_NUMBER_NEW_ACCOUNT = Target.the("Texto con valor de nueva cuenta").locatedBy("//a[@id='newAccountId']");
	public static final Target BTN_ACCOUNT_OVERVIEW = Target.the("Boton lista cuentas").locatedBy("//a[text()='Accounts Overview']");
	
}
