package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class StoreFacture {

	public static final Target LIST_DATAACCOUNTFACTURE = Target.the("Data account facture").locatedBy("//tr[position()>6 and position() < 15]//td[2]");
	public static final Target LIST_DATAPETSFACTURE = Target.the("Data pets facture").locatedBy("//td[@colspan='2']//tr[position()>1 and position() < last()]");
	public static final Target LIST_DATAPETFACTURE = Target.the("Data pet facture").locatedBy("//td[@colspan='2']//tr[position()>1 and position() < last()][{0}]/td");
	public static final Target TEXT_COSTTOTAL = Target.the("Text cost total").locatedBy("//th[@colspan='5']");
	public static final Target TEXT_ORDER = Target.the("Text ORDER").locatedBy("//th[@align='center']");
	
}
