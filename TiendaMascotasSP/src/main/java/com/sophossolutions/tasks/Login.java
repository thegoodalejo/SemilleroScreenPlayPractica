package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.LoginPage;
import com.sophossolutions.ui.HomePage;

public class Login implements Task {

	private String strUser, strPass;
	
	public Login(String strUser, String strPassword) {
		this.strUser = strUser;
		this.strPass = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(HomePage.BTN_SIGNIN),
				Enter.theValue(strUser).into(LoginPage.TXT_USERNAME),
				Enter.theValue(strPass).into(LoginPage.TXT_PASSWORD),
				Click.on(LoginPage.BTN_LOGIN));
	}
	
	public static Login withCredentials(String strUser, String strPass) {

		return instrumented(Login.class, strUser, strPass);
	}

}
