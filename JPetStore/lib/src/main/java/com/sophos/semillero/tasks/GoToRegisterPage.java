package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegisterPage implements Task {

	public GoToRegisterPage() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_LOGIN),
				Click.on(LoginPage.BTN_REGISTER));
	}

	public static GoToRegisterPage usingButtonAtTheBottom() {
		return instrumented(GoToRegisterPage.class);
	}

}
