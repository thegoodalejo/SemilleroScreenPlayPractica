package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://testsheepnz.github.io/BasicCalculator.html")
public class CalculatorHomePage extends PageObject {
	
	public static final Target BTN_CALCULATE = Target.the("Button calculate operation").locatedBy("//input[@value='Calculate']");
	public static final Target EDIT_TEXT_NUMBER1 = Target.the("Edit text number 1").locatedBy("//input[@name='number1']");
	public static final Target EDIT_TEXT_NUMBER2 = Target.the("Edit text number 1").locatedBy("//input[@name='number2']");
	public static final Target EDIT_TEXT_ANSWER = Target.the("Edit Text Answer").locatedBy("//input[@name='numberAnswer']");
	public static final Target OPTIONS_SELECT_MODE = Target.the("Selector Mode").locatedBy("//select[@name='selectBuild']//option[@value='{0}']");
	//public static final Target OPTIONS_OPERATION = Target.the("Selector Mode").locatedBy("//select[@name='selectOperation']//option");
	public static final Target SELECT_MODE = Target.the("Selector Mode").locatedBy("//select[@name='selectBuild']");
	public static final Target SELECT_OPERATION = Target.the("Selector Operation").locatedBy("//select[@name='selectOperation']");
	
	public static final Target MSSG_DIVIDE_BY_ZERO = Target.the("Label mssg of divide by zero").locatedBy("//label[@id='errorMsgField']");
	
}
