package com.sophossolutions.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ParaBankAccountListPage;
import com.sophossolutions.ui.ParaBankLoggedPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ParaBankAccounts implements Task {

	private String txtIn;
	
	
	public ParaBankAccounts(String txtIn) {
		this.txtIn = txtIn;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(ParaBankAccountListPage.TXT_SHOW_ACCOUNTS)
				);
	}
	
	public static ParaBankAccounts seeList (String txtIn) {
		return instrumented(ParaBankAccounts.class, txtIn);
	}

}
