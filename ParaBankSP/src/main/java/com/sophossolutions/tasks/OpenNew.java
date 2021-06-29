package com.sophossolutions.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.AccountsPage;
import com.sophossolutions.ui.OpenAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class OpenNew implements Task {

	public static OpenNew account() {
		return instrumented(OpenNew.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountsPage.LINK_OPEN_ACCOUNT),
				SelectFromOptions.byVisibleText("SAVINGS").from(OpenAccountPage.SELECT_TYPE), 
				SelectFromOptions.byIndex(7).from(OpenAccountPage.SELECT_ACCOUNT),
				Click.on(OpenAccountPage.BTN_OPEN_NEW));
	}

}
