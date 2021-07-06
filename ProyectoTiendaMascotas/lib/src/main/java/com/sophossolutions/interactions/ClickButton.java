package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickButton implements Interaction {

	private Target targetButton;
	private boolean boolState;
	
	public ClickButton(Target targetButton, boolean boolState) {
		super();
		this.targetButton = targetButton;
		this.boolState = boolState;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		if(boolState==true) {
			actor.attemptsTo(Click.on(targetButton));
		}
	}
	
	
	
	public static ClickButton whenState(Target targetButton, boolean boolState) {
		return Tasks.instrumented(ClickButton.class, targetButton, boolState);
	}

}
