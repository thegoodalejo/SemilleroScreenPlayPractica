package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class NewAccountPage {

	public static final Target BTN_OPENACCOUNT = Target.the("Button open account").located(By.xpath("//a[contains(@href,'openaccount')]"));
	public static final Target SELECT_TYPEACCOUNT = Target.the("Select type account").located(By.id("type"));
	public static final Target SELECT_EXISTINGACCOUNT = Target.the("Select existing account").located(By.id("fromAccountId"));
	public static final Target BTN_NEWACCOUNT = Target.the("Button new open account").located(By.xpath("//input[contains(@value,'Open New')]"));
	public static final Target TEXT_IDNEWACCOUNT = Target.the("Text ID new account").located(By.id("newAccountId"));
	public static final Target BTN_ACCOUNTS = Target.the("Button open accounts").located(By.xpath("//a[contains(@href,'overview.htm')]"));
	public static String strNumberAccount;

}
