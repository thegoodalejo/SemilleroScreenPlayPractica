package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.grupo3.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class CommonSteps {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	

	@Given("Quiero hacer una peticion a la API {string}")
	public void quieroHacerUnaPeticionALaAPI(String baseURL) {
		SerenityRest.given().contentType(Constants.CONTENT_TYPE);
		
		theActorCalled(Constants.ACTOR).whoCan(CallAnApi.at(baseURL));
	}
	
}
