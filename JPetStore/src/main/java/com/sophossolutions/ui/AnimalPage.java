package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AnimalPage {
	
	private final static String strXPahtTableAnimal = "//tr[position()>1 and position()<last()]";
	
	public static final Target LINK_ANIMALS = Target.the("Number of Animals").locatedBy(strXPahtTableAnimal);
	public static final Target LINK_ANIMAL = Target.the("Number of Animals").locatedBy(strXPahtTableAnimal + "[{0}]");
	public static final Target BTN_ANIMAL = Target.the("Number of Animals").locatedBy(strXPahtTableAnimal + "[{0}]//a[@class='Button']");
	
	public static final Target TEXT_ITEM_ID = Target.the("Text of ITEM ").locatedBy(strXPahtTableAnimal + "[{0}]//td[1]");
	public static final Target TEXT_PRODUCT_ID = Target.the("Text of Product Id").locatedBy(strXPahtTableAnimal + "[{0}]//td[2]");
	public static final Target TEXT_DESCRIPTION = Target.the("Description od animal").locatedBy(strXPahtTableAnimal + "[{0}]//td[3]");
	public static final Target TEXT_LIST_PRICE = Target.the("Description od animal").locatedBy(strXPahtTableAnimal + "[{0}]//td[4]");
		
}
