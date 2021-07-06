package com.sophossolutions.tasks;

import com.sophossolutions.ui.LoginPage;
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
		System.out.println("ESCRIBIR EN LOGINPAGE");
		actor.attemptsTo(
				Enter.theValue(strUser).into(LoginPage.INPUT_TEXT_USER_NAME),
				Enter.theValue(strPassword).into(LoginPage.INPUT_TEXT_PASSWORD),
				Click.on(LoginPage.BTN_LOGIN));
	}
	
	public static LoginTask withCredential(String strUser, String strPassword)
	{
		return instrumented(LoginTask.class, strUser, strPassword);
	}
}