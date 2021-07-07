package com.grupo3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.NoSuchElementException;

import com.grupo3.interactions.DeleteButton;
import com.grupo3.model.Animal;
import com.grupo3.questions.AmountOfElements;
import com.grupo3.ui.CartViewPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickRemoveButton implements Task{

	
	Animal animal;
	
	public ClickRemoveButton(Animal a) {
		this.animal = a;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Target removeButton = actor.asksFor(DeleteButton.forAnimal(this.animal));
		actor.attemptsTo(
					Click.on(removeButton)
				);
	}
	
	public static ClickRemoveButton fromCartElement(Animal a) {
		return null;
	}
	
	public static ClickRemoveButton forLastItemAddedByActor(Actor a) {
		Animal animal = a.recall("ADDED_ANIMAL");
		return instrumented(ClickRemoveButton.class, animal);
	}

}
