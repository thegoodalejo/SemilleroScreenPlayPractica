package com.sophossolutions.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.AccountListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ParaBankAccounts implements Task {

		
	
	public ParaBankAccounts() {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(AccountListPage.TXT_SHOW_ACCOUNTS)
				);
	}
	
	public static ParaBankAccounts seeList () {
		return instrumented(ParaBankAccounts.class);
	}

}
