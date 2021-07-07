package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class ChangeAmount implements Task{
	
	private int intAmount;
	private String strIdItem;

	public ChangeAmount(String strIdItem,int intAmount) {
		this.intAmount = intAmount;
		this.strIdItem = strIdItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(String.valueOf(intAmount)).into(CartPage.TXT_UPDATE_QUANTITY.of(strIdItem)),
				Click.on(CartPage.BTN_UPDATE));
		actor.remember("PRECIO_TOTAL", Text.of(CartPage.TXT_PRICE_T.of(strIdItem)).viewedBy(actor).asString());
		actor.remember("PRECIO_U", Text.of(CartPage.TXT_PRICE_U.of(strIdItem)).viewedBy(actor).asString());
		actor.remember("CANTIDAD", intAmount);
	}

	public static ChangeAmount in(String strIdItem, int intAmount) {

		return instrumented(ChangeAmount.class, strIdItem, intAmount);
	}
	
}
