package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.util.Constants;


public class GoToPage implements Task {

	private Target linkPage;
	private Target options;
	private Integer minValue = 1;
	
	
	
	public GoToPage(Target linkpage, Target opt){
		this.linkPage = linkpage;
		this.options = opt;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Integer accounts = options.resolveAllFor(actor).size();
		Integer randomValue = this.minValue + (int)(Math.random() * accounts );
		actor.attemptsTo(
				Click.on(linkPage.of(String.valueOf(randomValue)))
				);
		theActorInTheSpotlight().remember(Constants.DIR_INDEX_ANIMAL, randomValue.toString());
	}
	
	public static GoToPage type(Target linkpage,Target opt) {
		return instrumented(GoToPage.class, linkpage,opt);
	}
	
	public static GoToPage animals(Target linkpage,Target opt) {
		return instrumented(GoToPage.class, linkpage,opt);
	}

	public static GoToPage selectOne(Target linkpage,Target opt) {
		return instrumented(GoToPage.class, linkpage,opt);
	}
	
}