package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target INPUT_TEXT_USER_NAME = Target.the("Input for user name").locatedBy("//input[@name='username']");
	public static final Target INPUT_TEXT_PASSWORD = Target.the("Input for password").locatedBy("//input[@name='password']");
	public static final Target BTN_LOGIN = Target.the("Input for password").locatedBy("//input[@name='signon']");
	public static final Target LINK_TEXT_NEW_USER = Target.the("Link for rtegister new user").locatedBy("//a[contains(text(),'Register Now!')]");
}
