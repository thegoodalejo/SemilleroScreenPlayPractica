package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ConfirmOrderPage;
import com.sophossolutions.ui.FinalOrderPage;
import com.sophossolutions.ui.PaymentPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class SelectNextOptions implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	 
		actor.attemptsTo(Click.on(PaymentPage.BTN_CONTINUE),
				         Click.on(ConfirmOrderPage.BTN_CONFIRM));
		String[] strHeaderDate = Text.of(FinalOrderPage.TXT_ORDER_DATE).viewedBy(actor).asString().split(" ");
		actor.remember("FECHA", strHeaderDate[2]);
	}
	
	public static SelectNextOptions in() {

		return instrumented(SelectNextOptions.class);
	}
}
