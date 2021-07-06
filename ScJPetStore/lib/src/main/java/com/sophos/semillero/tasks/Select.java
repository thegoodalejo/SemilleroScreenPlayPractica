package com.sophos.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Select implements Task {

	private String strValue;
	private Target tarMenu;
	
	

	public Select(String strValue, Target tarMenu) {
		this.strValue = strValue;
		this.tarMenu = tarMenu;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectFromOptions.byValue(strValue).from(tarMenu));
	
		
	}

	public static Select the(String strValue, Target tarMenu) {
		return instrumented(Select.class,strValue,tarMenu);		
	}

}
