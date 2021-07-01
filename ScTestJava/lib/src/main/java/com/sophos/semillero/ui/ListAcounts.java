package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ListAcounts {

	public static final Target BTN_LISTA = Target.the("Boton LIstar").locatedBy("//a[text()='Accounts Overview']");
	public static final Target NUM_CUENTA = Target.the("Num Cuenta").locatedBy("//a[text()='{0}']");
	public static final Target VALOR_CUENTA = Target.the("Valor Cuenta").locatedBy("//a[text()='{0}']//ancestor::tr//td[2]");
	public static final Target ACCOUNT_TABLE=Target.the("Boton login").locatedBy("//h1[text()='Accounts Overview']");
	
}
