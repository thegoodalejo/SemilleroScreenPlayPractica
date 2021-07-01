package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.OpenAccountPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class GoToOpenAccountPage implements Task {

	public GoToOpenAccountPage() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_OPENACCOUNT)
				);
	}

	public static GoToOpenAccountPage usingButtonOnTheLeftPanel() {
		return instrumented(GoToOpenAccountPage.class);
	}
	
}
