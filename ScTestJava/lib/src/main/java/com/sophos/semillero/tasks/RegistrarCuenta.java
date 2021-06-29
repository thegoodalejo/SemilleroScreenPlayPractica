package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarCuenta implements Task {
	
	private String strValor;
	
	public RegistrarCuenta(String strValor) {
		this.strValor = strValor;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	//	actor.attemptsTo(Enter.theValue(strUser).into(LoginPage1.TXT_USER_NAME), 
	actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER),
			SelectFromOptions.byVisibleText(strValor).from(RegisterPage.FORM_OPTIONS),
			SelectFromOptions.byValue("13122").from(RegisterPage.FORM_NUMBER_OPTIONS),
			Click.on(RegisterPage.BTN_OPEN));
	
		
	}
	public static RegistrarCuenta withValue(String strValor) {
		return instrumented(RegistrarCuenta.class, strValor);
	}

}
