package com.sophossolutions.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewOrderFormPage {

	public static final Target BTN_CONTINUE = Target.the("Button to continue").located(By.name("newOrder"));
}
