package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class BillPaymentPage {
	
	public static final Target TXT_INFO_ORDER = Target.the("Information of order").locatedBy("(//tr[1])[1]");
	public static final Target TXT_ITEM_ID = Target.the("Information of id").locatedBy("(//td//a)[1]");
}
