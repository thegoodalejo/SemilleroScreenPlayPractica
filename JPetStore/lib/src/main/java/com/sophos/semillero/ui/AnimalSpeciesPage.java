package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AnimalSpeciesPage {
	
	public static final Target TB_NAMES = Target.the("Item names table").locatedBy("//tbody//tr");
	public static final Target BTN_ITEM_DETAIL = Target.the("Item detail button").locatedBy("//tbody//tr[{0}]//td[1]");
	
}
