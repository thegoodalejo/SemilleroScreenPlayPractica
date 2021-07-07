package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSpecie implements Task{
	
	private String strEspecie;
	
	public SelectSpecie (String strEspecie) {
		this.strEspecie = strEspecie;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(HomePage.SELECT_SPECIES.of(strEspecie)));
		
		
	}
	public static SelectSpecie withValue(String strEspecie) {

		return instrumented(SelectSpecie.class, strEspecie);
	}


}
