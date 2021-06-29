package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	
	private String userName;
	private String password;
	
	public Login (String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(userName).into(HomePage.TXT_USERNAME),
				Enter.theValue(password).into(HomePage.TXT_PASSWORD),
				Click.on(HomePage.BTN_LOGIN));
	}
	
	public static Login with(String userName,String password) {
		return instrumented(Login.class,userName,password);
	}
}
