package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AccountsPage {
	
	public static final Target TABLE_ACCOUNTS = Target.the("Table accounts").locatedBy("//a[@href='activity.htm?id={0}']");
}
