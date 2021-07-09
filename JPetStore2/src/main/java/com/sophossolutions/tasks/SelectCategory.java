package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCategory implements Task{
	
	int aleatorio;
	
	public SelectCategory () {
		aleatorio = (int) (Math.random()*5+1);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		if(aleatorio == 1) {
			actor.attemptsTo(Click.on(HomePage.IMG_CATEGORY_FISH));
		}
		if(aleatorio == 2) {
			actor.attemptsTo(Click.on(HomePage.IMG_CATEGORY_DOGS));
		}
		if(aleatorio == 3) {
			actor.attemptsTo(Click.on(HomePage.IMG_CATEGORY_REPTILES));
		}
		if(aleatorio == 4) {
			actor.attemptsTo(Click.on(HomePage.IMG_CATEGORY_CATS));
		}
		if(aleatorio == 5) {
			actor.attemptsTo(Click.on(HomePage.IMG_CATEGORY_BIRDS));
		}
	}
	
	public static SelectCategory in ( ) {
		return instrumented(SelectCategory.class);
	}

}
