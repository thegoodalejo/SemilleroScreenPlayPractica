package com.sophossolutions.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.AccountListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class BankAccounts implements Task {

		
	
	public BankAccounts() {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(AccountListPage.TXT_SHOW_ACCOUNTS)
				);
	}
	
	public static BankAccounts seeList () {
		return instrumented(BankAccounts.class);
	}

}
