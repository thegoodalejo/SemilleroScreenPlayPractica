package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import com.sophos.semillero.tasks.GoToLoginPage;
import com.sophossolutions.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToLogin implements Task{
	
	public GoToLogin() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_LOGIN));		
	}

	public static GoToLogin usingButtonAtTheTop() {
		return instrumented(GoToLogin.class);
	}

}
