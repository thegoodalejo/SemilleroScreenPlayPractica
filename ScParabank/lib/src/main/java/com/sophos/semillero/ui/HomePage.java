package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target TXT_WELCOME_MSG = Target.the("Welcome message").locatedBy("//*[text()='Account Services']");
	public static final Target BTN_ACCOUNTSOVERVIEW = Target.the("Button accounts overview").locatedBy("//*[text()='Accounts Overview']");
	public static final Target BTN_OPENACCOUNT = Target.the("Button open account").locatedBy("//*[text()='Open New Account']");
	public static final Target TXT_NEWACCOUNTNUMBERINLIST = Target.the("New account number in accounts overview list").locatedBy("//*[text()='{0}']");
	
}
