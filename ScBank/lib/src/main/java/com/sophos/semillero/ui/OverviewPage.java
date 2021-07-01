package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewPage {	
	
	public static final Target TABLE_ACCOUNTS = Target.the("Tabla con lista de cuentas").locatedBy("//tr");
	public static final Target TXT_ACCOUNT = Target.the("Texto nueva cuenta").locatedBy("//tr//a[text()={0}]");	
	
}
