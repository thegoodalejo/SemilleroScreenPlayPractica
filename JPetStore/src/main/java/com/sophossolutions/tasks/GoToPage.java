package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.HomePage;

public class GoToPage implements Task {

	private String strUrl;

	public GoToPage(String strUrl){
		this.strUrl = strUrl;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.url(strUrl),
				Click.on(HomePage.LINK_TEXT_SIGN_IN)
				);
	}
	public static GoToPage login(String strUrl) {
		return instrumented(GoToPage.class, strUrl);
	}
}
