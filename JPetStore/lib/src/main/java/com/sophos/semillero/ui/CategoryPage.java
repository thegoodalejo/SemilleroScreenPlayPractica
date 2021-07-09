package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryPage {
	
	public static final Target TB_NAMES = Target.the("Pet names table").locatedBy("//tbody//tr");
	public static final Target BTN_ITEM = Target.the("Item button").locatedBy("//tbody//tr[{0}]//td[1]");
	
}
