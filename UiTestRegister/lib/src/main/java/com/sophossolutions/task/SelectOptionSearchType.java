package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectOptionSearchType implements Task {
	
	private Target activateTarget;
	private Target inputTypeSearch;
	private String strTexInput;
	private final Target OPTION = Target.the("Option In search").locatedBy("//span[@class='ui-select-choices-row-inner']"); 
	
	public SelectOptionSearchType(Target activateTarget, Target inputTypeSearch, String strTexInput) {
		super();
		this.activateTarget = activateTarget;
		this.inputTypeSearch = inputTypeSearch;
		this.strTexInput = strTexInput;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Click.on(activateTarget),
				Enter.theValue(strTexInput).into(inputTypeSearch),
				Click.on(OPTION)
				);
		
	}

	public static SelectOptionSearchType on(Target activateTarget, Target inputTypeSearch, String strTexInput) {
		// TODO Auto-generated method stub
		return instrumented(SelectOptionSearchType.class, activateTarget, inputTypeSearch, strTexInput);
	}
	
	
	
}
