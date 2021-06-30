package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.AccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Account implements Task{
	
	
	public Account () {
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountPage.LINK_ACCOUNTS_OVERVIEW));
	}
	
	public static Account list () {
		return instrumented(Account.class);
	}

}
