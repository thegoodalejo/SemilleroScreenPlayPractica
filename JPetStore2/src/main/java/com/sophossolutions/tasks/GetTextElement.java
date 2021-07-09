package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class GetTextElement implements Task{

	Target target;
	
	public GetTextElement (Target target) {
		this.target = target;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("TEXT", target.resolveFor(actor).getText());
		
	}
	
	public static GetTextElement of(Target target) {
		return instrumented(GetTextElement.class, target);
	}

}
