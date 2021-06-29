package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class OpenAccount {
	public static final Target BTN_TYPE_ACCOUNT = Target.the("Menu tipo de cuenta").locatedBy("//select[@id='type']");
	public static final Target BTN_NUM_ACCOUNT = Target.the("Menu numero de cuenta").locatedBy("//select[@id='fromAccountId']");
	
	public static final Target BTN_OPEN = Target.the("Boton apertura de cuenta").locatedBy("//input");
	
	public static final Target TXT_ACCOUNT = Target.the("Numero de cuenta").locatedBy("//a[@id='newAccountId']");
}
