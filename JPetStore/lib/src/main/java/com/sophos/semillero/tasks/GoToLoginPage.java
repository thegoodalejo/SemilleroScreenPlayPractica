package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToLoginPage implements Task {

	public GoToLoginPage() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_LOGIN));
	}

	public static GoToLoginPage usingButtonAtTheTop() {
		return instrumented(GoToLoginPage.class);
	}

}
