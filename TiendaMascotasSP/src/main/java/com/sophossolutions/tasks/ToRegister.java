package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ToRegister implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(	
		Click.on(HomePage.BTN_SIGNIN),
		Click.on(LoginPage.BTN_REGISTER_NOW));
		
	}
	public static ToRegister in() {

		return instrumented(ToRegister.class);
	}
	
	

}
