package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.OpenaccountPage;
import com.sophos.semillero.ui.OverviewPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {
	
	public CreateAccount() {
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(OverviewPage.BTN_NEW_ACCOUNT),
				SelectFromOptions.byValue("1").from(OpenaccountPage.SELECT_TYPE_ACCOUNT),
				SelectFromOptions.byValue("12789").from(OpenaccountPage.SELECT_FROM_ACCOUNT),
				Click.on(OpenaccountPage.BTN_CREATE_NEW_ACCOUNT)
				);
	}

	public static CreateAccount go() {
		return instrumented(CreateAccount.class);		
	}	

}