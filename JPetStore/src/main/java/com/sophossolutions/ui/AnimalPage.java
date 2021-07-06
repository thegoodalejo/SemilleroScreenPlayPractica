package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AnimalPage {
	/*
	 * Para pagina del animal
	 */
	public static final Target TEXT_ITEM_ID = Target.the("Text of ITEM ID").locatedBy("//table//tr[2]//td");
	public static final Target TEXT_PRODUCT_ID = Target.the("Text of Product Id").locatedBy("//div[@id='BackLink']");
	public static final Target TEXT_DESCRIPTION = Target.the("Description od animal").locatedBy("//table//tr[3]//td");
	public static final Target TEXT_LIST_PRICE = Target.the("Description od animal").locatedBy("//table//tr[6]//td");

	
	/*
	 * Targes para la pagina.	
	 */
	/*
	public static final Target TEXT_ITEM_ID = Target.the("Text of ITEM ").locatedBy("//table//tr[{0}]//td[1]");
	public static final Target TEXT_PRODUCT_ID = Target.the("Text of Product Id").locatedBy("//table//tr[{0}]//td[2]");
	public static final Target TEXT_DESCRIPTION = Target.the("Description od animal").locatedBy("//table//tr[{0}]//td[3]");
	public static final Target TEXT_LIST_PRICE = Target.the("Description od animal").locatedBy("//table//tr[{0}]//td[4]");
	*/
		
}
