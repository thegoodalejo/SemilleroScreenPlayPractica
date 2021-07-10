package com.grupo3.interactions;

import static com.grupo3.util.WebElement.elementNo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.ThreadLocalRandom;

import com.grupo3.questions.AmountOfElements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickRandomElement implements Task{

	private Target selectedTargets;
	
	public ClickRandomElement(Target t) {
		this.selectedTargets = t;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		int amt = actor.asksFor(AmountOfElements.in(selectedTargets));
		int sel = ThreadLocalRandom.current().nextInt(0, amt);
		actor.attemptsTo(
					Click.on(elementNo(sel).fromList(selectedTargets.resolveAllFor(actor)))
				);
	}
	
	public static ClickRandomElement from(Target t) {
		return instrumented(ClickRandomElement.class, t);
	}
	
	
	
}
