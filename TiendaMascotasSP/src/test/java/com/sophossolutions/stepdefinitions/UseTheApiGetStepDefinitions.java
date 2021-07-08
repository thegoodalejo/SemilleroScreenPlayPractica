package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.GetRequest;
import com.sophossolutions.tasks.Apis_Get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class UseTheApiGetStepDefinitions {
	
	@Given("Deseo realizar peticiones a la API con url {string}")
	public void deseoRealizarPeticionesALaAPIConUrl(String strUrl) {
		theActorCalled("grupo_5").whoCan(CallAnApi.at(strUrl));
	}

	@When("Realizar la consulta GET a la url {string}")
	public void enviarLosDatosALaAPI(String strEndPoint) {
		theActorInTheSpotlight().wasAbleTo(Apis_Get.withValues(strEndPoint));

	}

	@Then("Verificar que la respuesta sea un estatutus {int}")
	public void verificarQueLaRespuestaSeaUnEstatutus(Integer intStatus) {
		theActorInTheSpotlight().should(seeThat(GetRequest.code(),IsEqual.equalTo(intStatus)));

	}

}
