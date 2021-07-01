package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class OpenAccountPage {
	
	public static final Target FORM_ACCOUNTTYPES = Target.the("Account type").locatedBy("//select[@id='type']");
	public static final Target FORM_STARTINGBALANCES = Target.the("Starting balance").locatedBy("//select[@id='fromAccountId']");
	public static final Target TXT_SUCCESS = Target.the("Account opening success").locatedBy("//*[text()='Account Opened!']");
	public static final Target TXT_NEWACCOUNTNUMBER = Target.the("New account number").locatedBy("//a[@id='newAccountId']");
	public static final Target BTN_OPENNEWACCOUNT = Target.the("Button open new account").locatedBy("//input[@value='Open New Account']");
	
}
