package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class TypingText implements Task{
	
	String strText;
	Target tgInput;
	
	public TypingText (String strText, Target tgInput) {
		this.strText = strText;
		this.tgInput = tgInput;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(strText).into(tgInput));
		
	}
	
	public static TypingText of (String strText, Target tgInput) {
		return instrumented(TypingText.class, strText, tgInput);
	}

}
