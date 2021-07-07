package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.sophossolutions.models.ItemOrderInvoice;
import com.sophossolutions.ui.BillPaymentPage;
import com.sophossolutions.util.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

public class GetInfoOrder implements Task {
		
	@Override
	public <T extends Actor> void performAs(T actor) {
		String infoOrder[] = Text.of(BillPaymentPage.TXT_INFO_ORDER).viewedBy(actor).asString().split(" ");
		System.out.println("----------");
		for (String string : infoOrder) {
			System.out.println(string);
		}
		System.out.println("----------");
		ItemOrderInvoice infoItemsOrder = new ItemOrderInvoice(infoOrder[1],infoOrder[2],infoOrder[3]);
		actor.remember(Constants.MODEL_ORDER, infoItemsOrder);
		
	}
	
	public static GetInfoOrder animal() {
		return instrumented(GetInfoOrder.class);
	}

}
