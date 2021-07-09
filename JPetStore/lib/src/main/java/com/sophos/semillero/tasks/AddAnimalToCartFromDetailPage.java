package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.DetailPage;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddAnimalToCartFromDetailPage implements Task {

	public AddAnimalToCartFromDetailPage() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("strItemDetailId", DetailPage.TXT_ITEM_ID.resolveFor(actor).getText());
		actor.attemptsTo(
				Click.on(DetailPage.BTN_ADD_TO_CART)
				);
	}

	public static AddAnimalToCartFromDetailPage usingButtonAtTheBottom() {
		return instrumented(AddAnimalToCartFromDetailPage.class);
	}

}
