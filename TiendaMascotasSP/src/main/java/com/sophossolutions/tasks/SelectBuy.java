package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.aspectj.runtime.internal.cflowstack.ThreadCounter;

import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.MyAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class SelectBuy implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(HomePage.BTN_MY_ACCOUNT));
		actor.remember("FIRSTNAME", Value.of(MyAccountPage.TXT_FIRSTNAME).viewedBy(actor).asString());
		actor.remember("LASTNAME", Value.of(MyAccountPage.TXT_LASTNAME).viewedBy(actor).asString());
		actor.remember("ADDRESS", Value.of(MyAccountPage.TXT_ADDRESS).viewedBy(actor).asString());
		actor.remember("CITY", Value.of(MyAccountPage.TXT_CITY).viewedBy(actor).asString());
		actor.remember("STATE", Value.of(MyAccountPage.TXT_STATE).viewedBy(actor).asString());
		actor.remember("ZIP", Value.of(MyAccountPage.TXT_ZIP).viewedBy(actor).asString());
		actor.remember("COUNTRY", Value.of(MyAccountPage.TXT_COUNTRY).viewedBy(actor).asString());
		actor.attemptsTo(Click.on(HomePage.BTN_CARRITO), Click.on(CartPage.BTN_PROCEED));
		
	}

	public static SelectBuy in() {

		return instrumented(SelectBuy.class);
	}

}