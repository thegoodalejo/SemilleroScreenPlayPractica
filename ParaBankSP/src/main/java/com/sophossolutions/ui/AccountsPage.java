package com.sophossolutions.ui;


import net.serenitybdd.screenplay.targets.Target;

public class AccountsPage {
	
	public static final Target LINK_OPTION = Target.the("Abrir nueva cuenta").locatedBy("//a[text()='{0}']");
	public static final Target TABLE_ACCOUNTS = Target.the("Tabla de cuentas").locatedBy("//table");
	public static final Target ACCOUNT_IN_TABLE = Target.the("Tabla de cuentas").locatedBy("//td//a[text()='{0}']");
	public static final Target AVAILABLE_IN_TABLE = Target.the("Tabla de cuentas").
			locatedBy("//td//a[text()='{0}']/ancestor::td/following-sibling::td");
	
}
