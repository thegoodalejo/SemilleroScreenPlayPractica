package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AccountListPage {
	public static final Target TXT_SHOW_ACCOUNTS = Target.the("Hipervinculo Ver cuentas").locatedBy("//a[contains(text(), 'Accounts Overview')]");
	public static final Target TXT_ACCOUNT_IN_LIST = Target.the("Elemento en la lista de cuentas").locatedBy("//table[@id='accountTable']//a[contains(text(),'{0}')]");
	public static final Target DATA_ACCOUNT = Target.the("Datos en la cuenta").locatedBy("//tr//a[contains(text(),'{0}')]");
}
