package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserNamePage {
	
	static public final Target BTN_NEXT = Target.the("Button to next").locatedBy("//a[@class='btn btn-blue']");
	static public final Target EDIT_TEXT_FIRST_NAME = Target.the("Edit text of first name").locatedBy("//input[@id='firstName']");
	static public final Target EDIT_TEXT_LAST_NAME = Target.the("Edit text of last name").locatedBy("//input[@id='lastName']");
	static public final Target EDIT_TEXT_EMAIL = Target.the("Edit text of email").locatedBy("//input[@id='email']");
	static public final Target EDIT_TEXT_SEARCH_LANGUAGE = Target.the("Edit text to search language").locatedBy("//input[@type='search']");
	static public final Target SELECT_BIRTH_MONTH = Target.the("Select for birth month").locatedBy("//select[@id='birthMonth']");
	static public final Target SELECT_BIRTH_DAY = Target.the("Select for birth day").locatedBy("//select[@id='birthDay']");
	static public final Target SELECT_BIRTH_YEAR = Target.the("Select for birth year").locatedBy("//select[@id='birthYear']");
	static public final Target SELECT_LANGUAGE = Target.the("Select for language").locatedBy("//span[@class='ui-select-choices-row-inner']//div");
	
}
