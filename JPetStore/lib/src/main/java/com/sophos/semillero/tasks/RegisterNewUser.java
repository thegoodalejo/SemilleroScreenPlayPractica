package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.model.RegisterModel;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterNewUser implements Task {

	public RegisterNewUser() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		RegisterModel rmNewUser = actor.recall("rmNewUser");
		
		actor.attemptsTo(Enter.theValue(rmNewUser.getStrUser()).into(RegisterPage.TXT_USERNAME),
				Enter.theValue(rmNewUser.getStrPassword()).into(RegisterPage.TXT_PASSWORD),
				Enter.theValue(rmNewUser.getStrPassword()).into(RegisterPage.TXT_REPEATEDPASSWORD),
				Enter.theValue(rmNewUser.getStrFirstName()).into(RegisterPage.TXT_FIRST_NAME),
				Enter.theValue(rmNewUser.getStrLastName()).into(RegisterPage.TXT_LAST_NAME),
				Enter.theValue(rmNewUser.getStrEmail()).into(RegisterPage.TXT_EMAIL),
				Enter.theValue(String.valueOf(rmNewUser.getIntPhone())).into(RegisterPage.TXT_PHONE),
				Enter.theValue(rmNewUser.getStrAddress1()).into(RegisterPage.TXT_ADDRESS_1),
				Enter.theValue(rmNewUser.getStrAddress2()).into(RegisterPage.TXT_ADDRESS_2),
				Enter.theValue(rmNewUser.getStrCity()).into(RegisterPage.TXT_CITY),
				Enter.theValue(rmNewUser.getStrState()).into(RegisterPage.TXT_STATE),
				Enter.theValue(String.valueOf(rmNewUser.getIntZip())).into(RegisterPage.TXT_ZIP),
				Enter.theValue(rmNewUser.getStrCountry()).into(RegisterPage.TXT_COUNTRY),
				Click.on(RegisterPage.BTN_REGISTER)
				);
	}

	public static RegisterNewUser withAllCredentials() {
		return instrumented(RegisterNewUser.class);
	}

}