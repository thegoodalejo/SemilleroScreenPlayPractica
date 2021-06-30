package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.sophossolutions.ui.OpenAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class OpenAccount implements Task{

	
	private String acountType;
	private String existingAcount;
	
	public OpenAccount (String acountType, String existingAcount) {
		
		this.acountType = acountType;
		this.existingAcount = existingAcount;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OpenAccountPage.LINK_CREATE_ACCOUNT),
		SelectFromOptions.byVisibleText(acountType).from(OpenAccountPage.LIST_TIPO_CUENTA),
		SelectFromOptions.byVisibleText(existingAcount).from(OpenAccountPage.LIST_CUENTA_EXISTENTE),
		Click.on(OpenAccountPage.BTN_OPEN_NEW_ACCOUNT));
		
	}
	
	public static OpenAccount with (String acountType, String existingAcount) {
		return instrumented(OpenAccount.class, acountType,existingAcount);
	}
	

}
