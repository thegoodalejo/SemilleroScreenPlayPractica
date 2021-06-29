package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophossolutions.semillero.tasks.ParaBankLogin;

public class paraBankStepdDefinitions {

	@Given("Ingresar a (.+) y hacer login con (.+) (.+)$")
	public void ingresarAYHacerLoginConJohnDemo(String url, String user, String password) {
		
		theActorCalled("Juan Miguel").wasAbleTo(Open.url(url));
		//theActorCalled("Juan Miguel").wasAbleTo(ParaBankLogin.login(user, password));
	}

	@When("Hacer el proceso de creacion capurar el dato generado")
	public void hacerElProcesoDeCreacionCapurarElDatoGenerado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validar que exista el dato")
	public void validarQueExistaElDato() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
}
