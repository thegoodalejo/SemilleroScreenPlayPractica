package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.NewUser;
import com.sophossolutions.tasks.ToRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

//import com.sophossolutions.tasks.SelectOption;
//import com.sophossolutions.tasks.OpenNew;
//import com.sophossolutions.ui.OpenAccountPage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class NewUserStepDefinitions {

	@Given("Deseo acceder a la opcion registrar nuevo usuario")
	public void deseoAccederALaOpcionRegistrarNuevoUsuario() {
		theActorCalled("grupo_5").wasAbleTo(ToRegister.in());

	}

	@When("Deseo ingresar los datos del nuevo usuario")
	public void deseoIngresarLosDatosDelNuevoUsuario() {
		theActorCalled("grupo_5").wasAbleTo(NewUser.withValues());

	}

	@Then("Deberia visualizar los datos en pantalla del nuevo usuario")
	public void deberiaVisualizarLosDatosEnPantallaDelNuevoUsuario() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
