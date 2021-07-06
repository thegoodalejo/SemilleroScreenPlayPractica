package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultAnimalsPage {
	public static final Target LINKS_ANIMALS_PORTAL = Target.the("Text for user logged").locatedBy("//table//tr");
	public static final Target LINK_ANIMAL_PORTAL = Target.the("Text for user logged").locatedBy("(//table//tr[{0}]//a)[1]");
	public static final Target LINKS_ANIMALS = Target.the("Text for user logged").locatedBy("//table//a");
	public static final Target LINK_ANIMAL = Target.the("Text for user logged").locatedBy("(//table//a)[{0}]");
}
