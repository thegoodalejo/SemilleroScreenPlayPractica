package com.guacha.tasks;

import com.guacha.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	
	private String uid;
	private String psw;
	
	public Login(String uid, String psw) {
		this.uid = uid;
		this.psw = psw;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
					Enter.theValue(this.uid).into(LoginPage.TXT_USERNAME),
					Enter.theValue(this.psw).into(LoginPage.TXT_PASSWORD),
					Click.on(LoginPage.BTN_LOGIN)
				);	
	}
	
	public static Login withCredentials(String username, String password) {
		
		return instrumented(Login.class, username, password);
		
	}
	
}
