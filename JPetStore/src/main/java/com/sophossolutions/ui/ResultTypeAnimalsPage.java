package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultTypeAnimalsPage {
	public static final Target LINKS_ANIMALS = Target.the("Text for user logged").locatedBy("//table//a");
	public static final Target LINK_ANIMAL = Target.the("Text for user logged").locatedBy("(//table//a)[{0}]");
}
