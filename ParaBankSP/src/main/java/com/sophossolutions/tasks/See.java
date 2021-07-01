package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.OpenAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class See implements Task {

	public static See account() {
		return instrumented(See.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OpenAccountPage.NUMERO_CUENTA));
		//OpenAccountPage.NUMERO_CUENTA.resolveFor(actor).getText();
		
	}

}
