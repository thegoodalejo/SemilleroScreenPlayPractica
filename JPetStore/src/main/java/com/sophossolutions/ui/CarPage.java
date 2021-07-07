package com.sophossolutions.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarPage {

	
	public static final Target TEXT_PRODUCT_ID = Target.the("Text of Product Id").locatedBy("//table//tr[{0}]//td[2]");
	public static final Target N_ANIMALS_TABLE = Target.the("Number of Animals").locatedBy("//table//tr");
	public static final Target BTN_REMOVE = Target.the("Number of Animals").locatedBy("//table//tr[{0}]//a[@class='Button']");
	public static final Target BTN_UPDATE_CAR = Target.the("Button to update").located(By.name("updateCartQuantities"));
	public static final Target TITLE_EMPTY = Target.the("Title when car is empty").locatedBy("//b[text()='Your cart is empty.']");
}
