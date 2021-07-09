package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class GoToCartPage implements Task {

	public GoToCartPage() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_CART)
				);
	}

	public static GoToCartPage usingButtonAtTheTop() {
		return instrumented(GoToCartPage.class);
	}
	
}
