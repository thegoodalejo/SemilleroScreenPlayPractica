package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryPage {
	
	public static final Target LINK_ANGELFISH = Target.the("Nombre Angelfish").locatedBy("//tbody//tr[2]");
	public static final Target LINK_TIGER_SHARK = Target.the("Nombre Tiger Shark").locatedBy("//tbody//tr[3]");
	public static final Target LINK_KOI = Target.the("Nombre Koi").locatedBy("//tbody//tr[4]");
	public static final Target LINK_GOLDFISH = Target.the("Nombre Goldfish").locatedBy("//tbody//tr[5]");
	
	public static Target LINK_CATEGORY;
	
	public static final Target TB_NAMES = Target.the("Table names pets").locatedBy("//tbody//tr");
}
