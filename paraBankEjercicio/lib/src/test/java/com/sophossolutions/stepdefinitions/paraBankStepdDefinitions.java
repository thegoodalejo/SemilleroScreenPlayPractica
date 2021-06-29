package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.sophossolutions.semillero.tasks.ParaBankLogin;
import com.sophossolutions.semillero.tasks.ParaBankAccounts;
import com.sophossolutions.semillero.tasks.ParaBankHome;

public class paraBankStepdDefinitions {

	
	
	@Given("Ingresar a (.+) y hacer login con (.+) (.+)$")
	public void ingresarAYHacerLoginConJohnDemo(String url, String user, String password) {
		
		theActorCalled("Juan Miguel").wasAbleTo(Open.url(url));
		theActorCalled("Juan Miguel").wasAbleTo(ParaBankLogin.in(user, password));
	}
	
	@When("Hacer el proceso de creacion para la opcion (.+) (.+)$")
	public void hacerElProcesoDeCreacionParaLaOpcion(String strType, Integer txtNumber) {
		theActorCalled("Juan Miguel").wasAbleTo(ParaBankHome.createUser(strType, txtNumber.toString()));
		
	}
	
	@Then("Validar que exista el dato")
	public void validarQueExistaElDato() {
		theActorCalled("Juan Miguel").wasAbleTo(ParaBankAccounts.seeList(""));
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
}
