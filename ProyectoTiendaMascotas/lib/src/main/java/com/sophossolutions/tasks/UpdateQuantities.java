package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.sophossolutions.ui.StoreHome.BTN_HOME;
import static com.sophossolutions.ui.StoreCar.TXT_QUANTITY;
import static com.sophossolutions.ui.StoreCar.BTN_SHOPPINGCAR;
import static com.sophossolutions.ui.StoreCar.BTN_UPDATE;
import static com.sophossolutions.ui.StoreCar.TXT_PRICE;


public class UpdateQuantities implements Task {

	private Integer intQuantitiesPets;
	
	public UpdateQuantities(Integer intQuantitiesPets) {
		super();
		this.intQuantitiesPets = intQuantitiesPets;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(BTN_HOME),
				Click.on(BTN_SHOPPINGCAR),
				Enter.theValue(String.valueOf(intQuantitiesPets)).into(TXT_QUANTITY),
				Click.on(BTN_UPDATE));
		actor.remember("strCostTotal", "$"+Double.parseDouble(Text.of(TXT_PRICE).viewedBy(actor).asString().replace("$", "0"))*intQuantitiesPets+"0");
	}
	
	
	public static UpdateQuantities ofPetsBy(Integer intQuantitiesPets) {
		return Tasks.instrumented(UpdateQuantities.class, intQuantitiesPets);
	}

}
