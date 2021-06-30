package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class ListAccount implements Task{
	
	Target TXT_ID_ACCOUNT;

	public ListAccount (String posicion) {
		this.TXT_ID_ACCOUNT = Target.the("Numero de cuenta").locatedBy("//tr[@ng-repeat='account in accounts']["+ posicion +"]//td[1]//a");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		TXT_ID_ACCOUNT.resolveFor(theActorInTheSpotlight()).getText();
		
	}
	
	public static ListAccount search ( String posicion ) {
		
		return instrumented(ListAccount.class, posicion);
	}

}
