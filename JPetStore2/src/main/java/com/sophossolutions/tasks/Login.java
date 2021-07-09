package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	
	private String strUser;
	private String strPassword;

	public Login(String strUser, String strPassword) {
		this.strUser = strUser;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strUser).into(LoginPage.INPUT_USERNAME),
				Enter.theValue(strPassword).into(LoginPage.INPUT_PASSWORD),
				Click.on(LoginPage.BTN_LOGIN)
				);
	}

	public static Login withCredential(String strUser, String strPassword) {
		return instrumented(Login.class, strUser, strPassword);
	}
}
