package com.grupo3.interactions;

import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.grupo3.questions.AmountOfElements;
import com.grupo3.ui.ProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ClickRandomAddToCartButton implements Task{

	Target possibleItems;
	
	public ClickRandomAddToCartButton(Target t) {
		this.possibleItems = t;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		int amt = actor.asksFor(AmountOfElements.in(possibleItems));
		int sel = ThreadLocalRandom.current().nextInt(1, amt+1);
		actor.attemptsTo(
					MakeChoice.ofElement(sel),
					Click.on(ProductPage.getAddToCartButtonNo(sel))
				);
	}
	
	public static ClickRandomAddToCartButton from(Target t) {
		return instrumented(ClickRandomAddToCartButton.class, t);
	}
	
	

}
