package com.grupo3.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.grupo3.interactions.GetCartItems.rememberTheItemsInTheCart;

public class GetTheCartInfo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(rememberTheItemsInTheCart());
		
	}
	
	public static GetTheCartInfo readAndRememberTheItemsInTheCart() {
		return instrumented(GetTheCartInfo.class);
	}

	
	
}
