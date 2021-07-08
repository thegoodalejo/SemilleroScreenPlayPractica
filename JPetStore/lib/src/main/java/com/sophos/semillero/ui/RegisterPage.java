package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static final Target TXT_USERNAME = Target.the("Username field").locatedBy("//*[@name='username']");
	public static final Target TXT_PASSWORD = Target.the("Password field").locatedBy("//*[@name='password']");
	public static final Target TXT_REPEATEDPASSWORD = Target.the("Repeated password field").locatedBy("//*[@name='repeatedPassword']");
	public static final Target TXT_FIRST_NAME = Target.the("First name field").locatedBy("//*[@name='account.firstName']");
	public static final Target TXT_LAST_NAME = Target.the("Last name field").locatedBy("//*[@name='account.lastName']");
	public static final Target TXT_EMAIL = Target.the("Email field").locatedBy("//*[@name='account.email']");
	public static final Target TXT_PHONE = Target.the("Phone field").locatedBy("//*[@name='account.phone']");
	public static final Target TXT_ADDRESS_1 = Target.the("Address 1 field").locatedBy("//*[@name='account.address1']");
	public static final Target TXT_ADDRESS_2 = Target.the("Address 2 field").locatedBy("//*[@name='account.address2']");
	public static final Target TXT_CITY = Target.the("City field").locatedBy("//*[@name='account.city']");
	public static final Target TXT_STATE = Target.the("State field").locatedBy("//*[@name='account.state']");
	public static final Target TXT_ZIP = Target.the("Zip code field").locatedBy("//*[@name='account.zip']");
	public static final Target TXT_COUNTRY = Target.the("Country field").locatedBy("//*[@name='account.country']");

	public static final Target BTN_REGISTER = Target.the("Register button").locatedBy("//*[@name='newAccount']");
	
}
