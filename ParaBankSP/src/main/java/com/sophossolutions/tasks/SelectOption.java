package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.AccountsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectOption implements Task {
	
	static String option;

	public static SelectOption link(String option) {
		SelectOption.option = option;
		return instrumented(SelectOption.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AccountsPage.LINK_OPTION.of(option)));
	}
}
