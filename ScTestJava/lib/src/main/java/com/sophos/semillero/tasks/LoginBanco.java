package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.LoginPage1;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginBanco implements Task{
	
	private String strUser;
	private String strPassword;
	
	public LoginBanco(String strUser, String strPassword) {
		this.strUser = strUser;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strUser).into(LoginPage1.TXT_USER_NAME), 
				Enter.theValue(strPassword).into(LoginPage1.TXT_PASSWORD),
				Click.on(LoginPage1.BTN_LOGIN));
		
	}
	public static LoginBanco withCredential(String strUser, String strPassword) {
		return instrumented(LoginBanco.class, strUser, strPassword);
	}

}
