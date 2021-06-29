package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static  net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{

	
	private String User;
	private String Password;
	
	public Login (String Usr, String Pass) {
		
		this.User = Usr;
		this.Password = Pass;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(User).into(LoginPage.TXT_USER_NAME),
				Enter.theValue(Password).into(LoginPage.TXT_PASSWORD),Click.on(LoginPage.BTN_LOGIN));
		
	}
	public static Login in (String Usr, String Pass) {
		return instrumented(Login.class, Usr,Pass);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
