package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.sophossolutions.models.ItemOrderInvoice;
import static com.sophossolutions.ui.BillPaymentPage.TXT_INFO_ORDER;
import static com.sophossolutions.util.Constants.MODEL_ORDER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class GetInfoOrder implements Task {
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		String infoOrder[] = Text.of(TXT_INFO_ORDER).viewedBy(actor).asString().split(" ");
		for (String string : infoOrder) {
			System.out.println(string);
		}
		ItemOrderInvoice infoItemsOrder = new ItemOrderInvoice(infoOrder[1],infoOrder[2],infoOrder[3]);
		actor.remember(MODEL_ORDER, infoItemsOrder);
		
	}
	
	public static GetInfoOrder animal() {
		return instrumented(GetInfoOrder.class);
	}

}
