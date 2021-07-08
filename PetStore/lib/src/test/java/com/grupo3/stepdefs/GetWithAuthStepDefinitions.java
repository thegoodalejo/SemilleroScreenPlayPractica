package com.grupo3.stepdefs;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.grupo3.tasks.FinishThePurchasingProcess.finishThePurchasingProcessWithCredentials;

import static com.grupo3.interactions.GetCartItems.rememberTheItemsInTheCart;

import com.grupo3.model.Purchase;
import com.grupo3.questions.TheInfoInTheReceipt;
import com.grupo3.questions.TheLatestApiResponse;
import com.grupo3.tasks.CallTheGetApi;
import com.grupo3.ui.CartViewPage;


public class GetWithAuthStepDefinitions {


	@When("Pido el usuario con id {string} al endpoint {string}")
	public void pidoElUsuarioConIdAlEndpoint(String usrId, String endpoint) {
	    theActorInTheSpotlight().wasAbleTo(CallTheGetApi.onEndpoint(endpoint).withParameter(usrId));
	}

	@Then("Valido que la solicitud retorne con codigo {int} y con nombre {string}")
	public void validoQueLaSolicitudRetorneConCodigoYConNombre(Integer responseCode, String actualName) {
		theActorInTheSpotlight().should(seeThat(TheLatestApiResponse.shouldHave("code", responseCode).and("data/name", actualName)));
	}
	
}
