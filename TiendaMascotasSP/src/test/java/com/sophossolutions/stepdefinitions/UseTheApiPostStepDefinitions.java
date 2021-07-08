package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.PostSend;
import com.sophossolutions.questions.ResultPost;
import com.sophossolutions.tasks.Apis_Post;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class UseTheApiPostStepDefinitions {
	
	@Given("Deseo realizar un registro en la API {string}")
	public void deseoRealizarUnRegistroEnLaAPI(String strUrl) {
		theActorCalled("grupo_5").whoCan(CallAnApi.at(strUrl));
	    
	}

	@When("Enviar los datos a la API {string}")
	public void enviarLosDatosALaAPI(String strEndPoint, io.cucumber.datatable.DataTable userData) {
		theActorCalled("grupo_5").wasAbleTo(Apis_Post.withValues(strEndPoint, userData));
			    
	}

	@Then("Verificar que la respuesta sea un {int}")
	public void verificarQueLaRespuestaSeaUn(Integer intStatus) {
		theActorInTheSpotlight().should(seeThat(ResultPost.response(),IsEqual.equalTo(intStatus)));
	    
	}

}
