package com.guacha.tasks;

import static com.guacha.ui.AccountCreationPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.guacha.ui.UserPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CreateAccount implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
					Click.on(UserPage.CREATE_ACCOUNT_LINK),
					Click.on(SEL_STARTER_ACCOUNT)
		);
		
		int accounts = ACCOUNT_OPTIONS.resolveAllFor(actor).size();
		int randomValue = 1 + (int)(Math.random() * accounts);
		
		actor.attemptsTo(
				Click.on(SEL_ACCOUNT_TYPE),
				SelectFromOptions.byValue("1").from(SEL_ACCOUNT_TYPE),
				Click.on(SEL_STARTER_ACCOUNT),
				SelectFromOptions.byIndex(randomValue).from(SEL_STARTER_ACCOUNT),
				Click.on(BTN_SUBMIT_ACCOUNT)
		);

	}
	
	public static CreateAccount createAnAccount() {
		return instrumented(CreateAccount.class);
	}
	
	

}
