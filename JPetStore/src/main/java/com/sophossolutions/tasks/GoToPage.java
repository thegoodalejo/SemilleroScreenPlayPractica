package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.util.Constants;


public class GoToPage implements Task {

	private Target tarLinkPage;
	private Target tarOptions;
	
	
	public GoToPage(Target tarLinkPage, Target tarOptions){
		this.tarLinkPage = tarLinkPage;
		this.tarOptions = tarOptions;
	}
	
	public GoToPage(Target tarLinkPage, Target tarOptions, Integer intMinValue, Integer accoutnMinus){
		this.tarLinkPage = tarLinkPage;
		this.tarOptions = tarOptions;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Integer accounts = tarOptions.resolveAllFor(actor).size();
		Integer randomValue = 1 + (int)(Math.random() * accounts );
		System.out.println(randomValue);
		actor.attemptsTo(
				Click.on(tarLinkPage.of(String.valueOf(randomValue)))
				);
		theActorInTheSpotlight().remember(Constants.DIR_INDEX_ANIMAL, randomValue.toString());
	}
	
	public static GoToPage type(Target tarLinkPage,Target tarOptions) {
		return instrumented(GoToPage.class, tarLinkPage,tarOptions);
	}
	
	public static GoToPage animals(Target tarLinkPage,Target tarOptions) {
		return instrumented(GoToPage.class, tarLinkPage,tarOptions);
	}

	public static GoToPage selectOne(Target tarLinkPage,Target tarOptions) {
		return instrumented(GoToPage.class, tarLinkPage,tarOptions);
	}
	
}