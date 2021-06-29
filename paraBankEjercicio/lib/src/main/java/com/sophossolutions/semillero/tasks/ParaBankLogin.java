package com.sophossolutions.semillero.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import static  net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ParaBankHome;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ParaBankLogin implements Task {
	
	private String userName;
	private String password;
	
	public ParaBankLogin(String username, String password) {
		this.userName = username;
		this.password = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(userName).into(ParaBankHome.TXT_USER_NAME),
				Enter.theValue(password).into(ParaBankHome.TXT_USER_PASWORD),
				Click.on(ParaBankHome.BTN_LOGIN)
				);		
	}
	
	public static ParaBankLogin login (String userName, String password) {
		return instrumented(ParaBankLogin.class, userName, password);
	}
}
