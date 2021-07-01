package com.sophossolutions.semillero.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CreateUser implements Task {
	
	private String number;
	private String type;
	
	public CreateUser(String type,String number) {
		this.type = type;
		this.number = number;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(HomePage.TXT_LINK_CREATE_USER),
				SelectFromOptions.byVisibleText(type).from(HomePage.SELECT_CHECKING),
				SelectFromOptions.byVisibleText(number).from(HomePage.SELECT_NUMBER),
				Click.on(HomePage.BTN_CREATE_ACCOUNT)
				);
		//actor.remember("ID_ACCOUNT", ParaBankLoggedPage.TXT_NUM_CREATED);
	}
	
	public static CreateUser whitData (String type, String number) {
		return instrumented(CreateUser.class, type, number);
	}
	

}
