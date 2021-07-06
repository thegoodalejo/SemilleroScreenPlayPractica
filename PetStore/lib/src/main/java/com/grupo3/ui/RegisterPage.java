package com.grupo3.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage
{
	public static final Target TXT_USER_ID = Target.the("User id input field").located(By.xpath("//input[@name = 'username']"));
	public static final Target TXT_NEW_PASS = Target.the("New password input field").located(By.xpath("//input[@name = 'password']"));
	public static final Target TXT_REPEAT_PASS = Target.the("Repeat password input field").located(By.xpath("//input[@name = 'repeatedPassword']"));
	public static final Target TXT_FIRSTNAME = Target.the("First name input field").located(By.xpath("//input[@name = 'account.firstName']"));
	public static final Target TXT_LASTNAME = Target.the("Last name input field").located(By.xpath("//input[@name = 'account.lastName']"));
	public static final Target TXT_EMAIL = Target.the("Email input field").located(By.xpath("//input[@name = 'account.email']"));
	public static final Target TXT_PHONE = Target.the("Phone input field").located(By.xpath("//input[@name = 'account.phone']"));
	public static final Target TXT_ADDRESS1 = Target.the("Address #1 input field").located(By.xpath("//input[@name = 'account.address1']"));
	public static final Target TXT_ADDRESS2 = Target.the("Address #2 input field").located(By.xpath("//input[@name = 'account.address2']"));
	public static final Target TXT_CITY = Target.the("City input field").located(By.xpath("//input[@name = 'account.city']"));
	public static final Target TXT_STATE = Target.the("State input field").located(By.xpath("//input[@name = 'account.state']"));
	public static final Target TXT_ZIP = Target.the("Zip input field").located(By.xpath("//input[@name = 'account.zip']"));
	public static final Target TXT_COUNTRY = Target.the("Country input field").located(By.xpath("//input[@name = 'account.country']"));
	
	public static final Target BTN_SAVE_ACOUNT = Target.the("Create acount button").located(By.xpath("//*[@id=\"Catalog\"]/form/input"));
}