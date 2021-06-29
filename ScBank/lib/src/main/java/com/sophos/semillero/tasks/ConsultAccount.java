package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.OpenaccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultAccount implements Task {
	
	public ConsultAccount() {
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OpenaccountPage.BTN_ACCOUNT_OVERVIEW));
	}

	public static ConsultAccount go() {
		return instrumented(ConsultAccount.class);		
	}	

}