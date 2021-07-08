package com.grupo3.stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import static com.grupo3.tasks.FinishThePurchasingProcess.finishThePurchasingProcessWithCredentials;

import static com.grupo3.interactions.GetCartItems.rememberTheItemsInTheCart;

import com.grupo3.model.Purchase;
import com.grupo3.questions.TheInfoInTheReceipt;
import com.grupo3.questions.TheLatestApiResponse;
import com.grupo3.tasks.CallTheGetApi;
import com.grupo3.tasks.CallThePostApi;
import com.grupo3.ui.CartViewPage;
import com.grupo3.util.File;


public class PostWithAuthStepDefinitions {

	@When("Envio la informacion de la publicacion al endpoint {string}")
	public void envioLaInformacionDeLaPublicacionAlEndpoint(String endpoint) {
		String postBody = File.randomBodyForPost();
		String postTitle = File.randomTitleForPost();
		
		
		theActorInTheSpotlight().wasAbleTo(CallThePostApi.onEndpoint(endpoint)
					.toCreatePostWithTitle(postTitle)
					.andBody(postBody)
				);
	}

	@Then("Valido que la solicitud retorne con codigo {int}")
	public void validoQueLaSolicitudRetorneConCodigo(Integer responseCode) {
		theActorInTheSpotlight().should(seeThat(TheLatestApiResponse.shouldHave("code", responseCode)));
	}
}
