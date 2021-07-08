package com.sophos.semillero.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Invoice {
	public static final Target TXT_ORDER_DATE = Target.the("Order number and date").locatedBy("//tbody//tr[1]//th[@colspan='2']");
	public static final Target TXT_BILL = Target.the("Bill information").locatedBy("//tr[position()>6 and position() < 15][{0}]//td[2]");
	public static final Target TXT_BILL_ITEMS = Target.the("Bill items information").locatedBy("//td[@colspan='2']//tr[position()>1]");
}
