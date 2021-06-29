package com.guacha.tasks;

import com.guacha.ui.UserPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoHome implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(UserPage.ACCOUNT_OVERVIEW_LINK)
		);
		
	}
	
	public static GoHome returnToHomePage() {
		return instrumented(GoHome.class);
	}

}
