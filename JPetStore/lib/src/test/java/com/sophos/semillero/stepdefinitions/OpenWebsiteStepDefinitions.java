package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OpenWebsiteStepDefinitions {
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Open website {string}")
	public void navigateToLoginPage(String strUrl) {
		theActorCalled("Grupo 4").wasAbleTo(Open.url(strUrl));
	}
}
