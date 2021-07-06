package com.grupo3.questions;

import com.grupo3.ui.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MainMenu implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return MainPage.OPTIONS_IN_MENU.resolveAllFor(actor).size() == 4;
	}
	
	public static MainMenu hasLoggedInOptions() {
		return new MainMenu();
	}

}
