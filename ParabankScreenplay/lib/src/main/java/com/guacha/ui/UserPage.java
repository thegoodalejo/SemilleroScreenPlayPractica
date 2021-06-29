package com.guacha.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserPage {
	
	public static final Target TABLE_ACCOUNTS = Target.the("Account Table").locatedBy("//table[@id='accountTable']");
	public static final Target CREATE_ACCOUNT_LINK = Target.the("Create Account Link").locatedBy("(//div[@id='leftPanel']//a)[1]");
	public static final Target ACCOUNT_OVERVIEW_LINK = Target.the("Account overview Link").locatedBy("(//div[@id='leftPanel']//a)[2]");
	
}
