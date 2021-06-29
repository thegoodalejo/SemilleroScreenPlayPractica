package com.sophossolutions.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ParaBankLoggedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ParaBankHome implements Task {
	
	private String number;
	private String type;
	public String numberOfPage;
	
	public ParaBankHome(String type,String number) {
		this.type = type;
		this.number = number;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(ParaBankLoggedPage.TXT_LINK_CREATE_USER),
				SelectFromOptions.byValue(type).from(ParaBankLoggedPage.SELECT_CHECKING),
				SelectFromOptions.byValue(number).from(ParaBankLoggedPage.SELECT_NUMBER),
				Click.on(ParaBankLoggedPage.BTN_CREATE_ACCOUNT)
				);
		numberOfPage = ParaBankLoggedPage.TXT_NUM_CREATED.toString();
	}
	
	public static ParaBankHome createUser (String type, String number) {
		return instrumented(ParaBankHome.class, type, number);
	}
	

}
