package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AccountsPage {
	
	public static final Target ID_ACCOUNT = Target.the("Id account").locatedBy("//a[@href='activity.htm?id={0}']");
	public static final Target ACCOUNT_BALANCE = Target.the("Account balance").locatedBy("//a[@href='activity.htm?id={0}']/ancestor::tr/td[2]");
	public static final Target TXT_WELCOME = Target.the("Text Welcome").locatedBy("//p[@class='smallText']");
	public static final Target TABLE_ACCOUNTS = Target.the("Table Accounts").locatedBy("//table/tbody/tr");
	public static final Target DATA_ACCOUNTS = Target.the("Table Accounts").locatedBy("//table/tbody/tr[{0}]/td");
}
