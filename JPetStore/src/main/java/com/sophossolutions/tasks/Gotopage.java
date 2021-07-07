package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Gotopage implements Task {

	private Target linkPage;
	private Target options;

	public Gotopage(Target linkpage, Target opt){
		this.linkPage = linkpage;
		this.options = opt;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		int accounts = options.resolveAllFor(actor).size();
		int randomValue = 1 + (int)(Math.random() * accounts);
		System.out.println(randomValue);
		actor.attemptsTo(
				Click.on(linkPage.of(String.valueOf(randomValue)))
				);
	}
	
	public static Gotopage animal(Target linkpage,Target opt) {
		return instrumented(Gotopage.class, linkpage,opt);
	}
}
