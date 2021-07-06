package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterAcount
{
	public static final Target LINK_OPEN_ACOUNT = Target.the("Link de abrir nueva cuenta").locatedBy("//a[text()='Open New Account']");
	public static final Target TYPE_ACOUNT_OPTIONS = Target.the("Tipo de cuenta").locatedBy("//select[@id='type']");
	public static final Target NUMBER_ACOUNT_OPTIONS = Target.the("Numero de cuenta").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_NEW_ACOUNT = Target.the("Campo de usuario").locatedBy("//input[@value='Open New Account']");
	public static final Target NEW_ACOUNT = Target.the("Numero de cuenta nueva").locatedBy("//a[@id='newAccountId']");

	public static final Target LINK_OVERVIEW = Target.the("Boton LIstar").locatedBy("//a[text()='Accounts Overview']");
	public static final Target NEW_NUMBER_ACOUNT = Target.the("Num Cuenta").locatedBy("//a[text()='{0}']");
	public static final Target NUMBER_ACOUNT_TABLE = Target.the("Valor Cuenta").locatedBy("//a[text()='{0}']//ancestor::tr//td[2]");
}