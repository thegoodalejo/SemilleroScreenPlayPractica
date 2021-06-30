package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ListAccountPage {

	public static final Target TXT_ID_ACCOUNT = Target.the("Numero de cuenta").locatedBy("//tr[@ng-repeat='account in accounts'][1]//td[1]//a");

}
