package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class StoreItem {
	public static final Target PET_VIEWLINK = Target.the("PET VIEW").locatedBy("//td[contains(text(), '{0}')]//parent::*//a");
	public static final Target PET_ID = Target.the("PET VIEW").locatedBy("//b[contains(text(), '{0}')]");
}
