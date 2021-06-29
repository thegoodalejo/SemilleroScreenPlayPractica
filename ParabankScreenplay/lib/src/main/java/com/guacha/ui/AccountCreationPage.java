package com.guacha.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class AccountCreationPage {

	public static final Target SEL_ACCOUNT_TYPE = Target.the("Account type selector").located(By.id("type"));
	public static final Target SEL_STARTER_ACCOUNT = Target.the("Starter account selector").located(By.id("fromAccountId"));
	public static final Target BTN_SUBMIT_ACCOUNT = Target.the("Account creation button").locatedBy("//input");
	public static final Target ACCOUNT_OPTIONS = Target.the("Avaliable accounts").locatedBy("//select[@id='fromAccountId']/option");
	
}
