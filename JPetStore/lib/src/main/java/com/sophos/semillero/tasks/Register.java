package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

	private String strUser;
	private String strPassword;
	private String strFirstName;
	private String strLastName;
	private String strEmail;
	private int intPhone;
	private String strAddress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private int intZip;
	private String strCountry;

	public Register(String strUser, String strPassword, String strFirstName, String strLastName,
			String strEmail, int intPhone, String strAddress1, String strAddress2, String strCity,
			String strState, int intZip, String strCountry) {
		this.strUser = strUser;
		this.strPassword = strPassword;
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strEmail = strEmail;
		this.intPhone = intPhone;
		this.strAddress1 = strAddress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.intZip = intZip;
		this.strCountry = strCountry;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strUser).into(RegisterPage.TXT_USERNAME),
				Enter.theValue(strPassword).into(RegisterPage.TXT_PASSWORD),
				Enter.theValue(strPassword).into(RegisterPage.TXT_REPEATEDPASSWORD),
				Enter.theValue(strFirstName).into(RegisterPage.TXT_FIRST_NAME),
				Enter.theValue(strLastName).into(RegisterPage.TXT_LAST_NAME),
				Enter.theValue(strEmail).into(RegisterPage.TXT_EMAIL),
				Enter.theValue(String.valueOf(intPhone)).into(RegisterPage.TXT_PHONE),
				Enter.theValue(strAddress1).into(RegisterPage.TXT_ADDRESS_1),
				Enter.theValue(strAddress2).into(RegisterPage.TXT_ADDRESS_2),
				Enter.theValue(strCity).into(RegisterPage.TXT_CITY),
				Enter.theValue(strState).into(RegisterPage.TXT_STATE),
				Enter.theValue(String.valueOf(intZip)).into(RegisterPage.TXT_ZIP),
				Enter.theValue(strCountry).into(RegisterPage.TXT_COUNTRY),
				Click.on(RegisterPage.BTN_REGISTER)
				);
	}

	public static Register withAllCredentials(String strUser, String strPassword, String strFirstName,
			String strLastName, String strEmail, int intPhone, String strAddress1, String strAddress2,
			String strCity, String strState, int intZip, String strCountry) {
		return instrumented(Register.class, strUser, strPassword, strFirstName, strLastName,
				strEmail, intPhone, strAddress1, strAddress2, strCity, strState, intZip, strCountry);
	}

}