package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class StoreRegister {
	
	public static final Target TXT_USERNAME = Target.the("User name field").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Password field").located(By.name("password")); 
	public static final Target TXT_REPEATPASSWORD = Target.the("Repeat Password field").located(By.name("repeatedPassword")); 
	public static final Target TXT_FIRSTNAME = Target.the("First name field").located(By.name("account.firstName")); 
	public static final Target TXT_LASTNAME = Target.the("Last name field").located(By.name("account.lastName")); 
	public static final Target TXT_EMAIL = Target.the("Email field").located(By.name("account.email")); 
	public static final Target TXT_PHONE = Target.the("Phone field").located(By.name("account.phone")); 
	public static final Target TXT_ADDRESS1 = Target.the("Address 1 field").located(By.name("account.address1")); 
	public static final Target TXT_ADDRESS2 = Target.the("Address 2 field").located(By.name("account.address2")); 
	public static final Target TXT_CITY = Target.the("City field").located(By.name("account.city")); 
	public static final Target TXT_STATE = Target.the("State field").located(By.name("account.state")); 
	public static final Target TXT_ZIP = Target.the("Zip field").located(By.name("account.zip")); 
	public static final Target TXT_COUNTRY = Target.the("Country field").located(By.name("account.country")); 
	public static final Target SELECT_LANGUAGEPREFERENCE = Target.the("Language preference field").located(By.name("account.languagePreference")); 
	public static final Target SELECT_FAVOURITECATEGORY = Target.the("Favourite Category field").located(By.name("account.favouriteCategoryId")); 
	public static final Target BOOL_ENABLEMYLIST = Target.the("Enable my list").located(By.name("account.listOption")); 
	public static final Target BOOL_ENABLEMYBANNER = Target.the("Enable my banner").located(By.name("account.bannerOption")); 
	public static final Target BTN_REGISTER = Target.the("Register button").located(By.name("newAccount"));
	public static final Target LIST_DATAACCOUNT = Target.the("").located(By.xpath("//table[2]//tr//input"));

}
