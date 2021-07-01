package com.sophos.semillero.tasks;

import com.sophos.semillero.questions.AccountResult;
import com.sophos.semillero.ui.OpenaccountPage;
import com.sophos.semillero.ui.OverviewPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateAccount implements Task {
	
	public CreateAccount() {
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				SelectFromOptions.byValue("1").from(OpenaccountPage.SELECT_TYPE_ACCOUNT),
				SelectFromOptions.byIndex(1).from(OpenaccountPage.SELECT_FROM_ACCOUNT),
				Click.on(OpenaccountPage.BTN_CREATE_NEW_ACCOUNT)
				);
		
		String numberNewAccount = AccountResult.in(OpenaccountPage.TXT_NUMBER_NEW_ACCOUNT).answeredBy(actor);
		actor.remember("New account Number", numberNewAccount);
	}

	public static CreateAccount go() {
		return instrumented(CreateAccount.class);		
	}	

}