package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Delete implements Task{
	
	private String strIdItem;
	
	public Delete (String strIdItem) {
		
		this.strIdItem = strIdItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CartPage.BTN_REMOVE.of(strIdItem)));
		actor.remember("ID_ITEM", strIdItem);
	    
	}
	
	public static Delete the(String strIdItem) {

		return instrumented(Delete.class, strIdItem);
	}
}
