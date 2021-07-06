package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


//import com.sophossolutions.tasks.SelectOption;
//import com.sophossolutions.tasks.OpenNew;
//import com.sophossolutions.ui.OpenAccountPage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class NewUserStepDefinitions {

	@Given("Deseo acceder a la opcion registrar nuevo usuario")
	public void deseoAccederALaOpcionRegistrarNuevoUsuario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Deseo ingresar los datos del nuevo usuario")
	public void deseoIngresarLosDatosDelNuevoUsuario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Deberia visualizar los datos en pantalla del nuevo usuario")
	public void deberiaVisualizarLosDatosEnPantallaDelNuevoUsuario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
