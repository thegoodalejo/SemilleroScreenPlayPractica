package com.sophossolutions.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.targets.Target;

public class Remove implements Task
{
	private Target TargetClic;
	private Target NAnimals;
	

	public Remove(Target Targetclic,Target Nanimals){
		this.TargetClic = Targetclic;
		this.NAnimals = Nanimals;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		Integer accounts = NAnimals.resolveAllFor(actor).size() ;
		for (int i = 0; i < accounts ; i++) {
			actor.attemptsTo(Click.on(TargetClic));
		}
	}
	
	public static Remove with(Target Targetclic,Target Nanimals)
	{
		return instrumented(Remove.class, Targetclic,Nanimals);
	}
}