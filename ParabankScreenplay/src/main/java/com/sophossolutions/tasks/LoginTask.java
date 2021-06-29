package com.sophossolutions.tasks;

import com.sophossolutions.ui.ParabankLogin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task
{
	private String strUser;
	private String strPassword;
	
	public LoginTask(String strUser, String strPassword) {
		this.strUser = strUser;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Enter.theValue(strUser).into(ParabankLogin.TXT_USER),
			Enter.theValue(strPassword).into(ParabankLogin.TXT_PASSWORD),
			Click.on(ParabankLogin.BTN_LOGIN));
	}
	
	public static LoginTask withCredential(String strUser, String strPassword)
	{
		return instrumented(LoginTask.class, strUser, strPassword);
	}
}