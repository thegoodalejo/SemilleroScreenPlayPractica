package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserFinalDataPage {
	
	static public final Target EDIT_TEXT_PASSWORD = Target.the("Edit text odf password").locatedBy("//input[@id='password']");
	static public final Target EDIT_TEXT_CONFIRM_PASSWORD = Target.the("Edit text odf password").locatedBy("//input[@id='confirmPassword']");
	static public final Target CHECKBOX_OPTION = Target.the("Option checkbox").locatedBy("//div[@class='row col-xs-12']//input[@type='checkbox']");
	static public final Target BTN_SUBMIT_ALL = Target.the("Option checkbox").locatedBy("//a[@id='laddaBtn']");
	
}
