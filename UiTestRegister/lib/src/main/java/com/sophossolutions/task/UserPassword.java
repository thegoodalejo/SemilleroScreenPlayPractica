package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.sophossolutions.ui.UserFinalDataPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserPassword implements Task{

	private String strPassword;

	public UserPassword(String strPassword) {
		super();
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.wasAbleTo(
				Enter.theValue(strPassword).into(EDIT_TEXT_PASSWORD),
				Enter.theValue(strPassword).into(EDIT_TEXT_CONFIRM_PASSWORD),
				Click.on(CHECKBOX_OPTION)
				);
	}

	public static UserPassword write(String strPassword) {
		// TODO Auto-generated method stub
		return instrumented(UserPassword.class, strPassword);
	}
	
}
