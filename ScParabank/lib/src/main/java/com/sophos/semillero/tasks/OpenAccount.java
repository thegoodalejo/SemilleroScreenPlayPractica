package com.sophos.semillero.tasks;

import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.OpenAccountPage;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class OpenAccount implements Task {

	private String strAccountType;
	private int numStartingBalance;

	public OpenAccount(String strAccountType, int numStartingBalance) {
		this.strAccountType = strAccountType;
		this.numStartingBalance = numStartingBalance;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BTN_OPENACCOUNT),
				SelectFromOptions.byVisibleText(strAccountType).from(OpenAccountPage.FORM_ACCOUNTTYPES),
				SelectFromOptions.byValue(String.valueOf(numStartingBalance)).from(OpenAccountPage.FORM_STARTINGBALANCES),
				Click.on(OpenAccountPage.BTN_OPENNEWACCOUNT)
				);
	}

	public static OpenAccount clickingOnOpenAccount(String strAccountType, int numStartingBalance) {
		return instrumented(OpenAccount.class, strAccountType, numStartingBalance);
	}
	
	public static OpenAccount saveAndGoBackToAccountsOverview(String strAccountType, int numStartingBalance) {
		return instrumented(OpenAccount.class, strAccountType, numStartingBalance);
	}
	
}
