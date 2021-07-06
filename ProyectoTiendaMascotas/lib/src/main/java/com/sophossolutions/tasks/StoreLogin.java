package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sophossolutions.ui.StoreLogin.TXT_USERNAME;
import static com.sophossolutions.ui.StoreLogin.TXT_PASSWORD;
import static com.sophossolutions.ui.StoreLogin.BTN_LOGIN;

public class StoreLogin  implements Task{

	private String strUserName;
	private String strPassword;
	
	public StoreLogin(String strUserName, String strPassword) {
		super();
		this.strUserName = strUserName;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(strUserName).into(TXT_USERNAME),
				Enter.theValue(strPassword).into(TXT_PASSWORD),
				Click.on(BTN_LOGIN));
	}
	
	
	public static StoreLogin withCredentials(String strUserName, String strPassword) {
		return Tasks.instrumented(StoreLogin.class, strUserName, strPassword);
	}

}
