package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewP {
	public static final Target BTN_OVERVIEW = Target.the("Boton para ver cuentas").locatedBy("//a[@href='/parabank/overview.htm']");
	public static final Target TXT_CUENTA = Target.the("Campo de la cuenta").locatedBy("//a[@href='activity.htm?id={0}']");
}
