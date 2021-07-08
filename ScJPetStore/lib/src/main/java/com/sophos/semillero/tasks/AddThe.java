package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import com.sophos.semillero.interactions.AddItemsToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class AddThe implements Task {

	private Map<String,String> mapValues;
	

	public AddThe(Map<String, String> mapValues) {
		this.mapValues = mapValues;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(AddItemsToCart.the(mapValues));
	}

	public static AddThe items(Map<String,String> mapValues) {
		return instrumented(AddThe.class,mapValues);		
	}

}
