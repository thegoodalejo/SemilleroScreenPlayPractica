package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class StoreCar {
	public static final Target PET_SELECTED = Target.the("PET SELECT").locatedBy("//*[contains(text(), '{0}')]");
	public static final Target BTN_REMOVE = Target.the("PET SELECT").locatedBy("//td[contains(text(), '{0}')]//ancestor::tr//a[@class]");
	public static final Target TXT_QUANTITY = Target.the("Quantity of pets").locatedBy("//tr[position()>1 and position() < last()]//td[5]");
	
}

