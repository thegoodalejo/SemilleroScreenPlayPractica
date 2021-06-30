package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.LoginBanco;
import com.sophos.semillero.tasks.RegistrarCuenta;
import com.sophos.semillero.tasks.VerificarCuenta;
import com.sophos.semillero.ui.ListAcounts;
import com.sophos.semillero.ui.LoginPage;
import com.sophos.semillero.ui.RegisterPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroBancoStepDefinitions {
	

	
	@Given("Deseo acceder a la vista agregar nueva cuenta")
	public void deseoAccederALaVistaAgregarNuevaCuenta() {
		//temporalmente ya que la pagina esta averiada 
		theActorCalled("Andres Lopez").should(seeThat(the(LoginPage.LOGIN_TABLE), isVisible()));
	}

	@When("Registrar una nueva cuenta {string}")
	public void registrarUnaNuevaCuenta(String strValue) {
	    theActorCalled("Andres Lopez").wasAbleTo(RegistrarCuenta.withValue(strValue));
	    
	}

	@Then("Deberia encontrar la cuenta nueva")
	public void deberiaEncontrarLaCuentaNueva() {
		theActorCalled("Andres Lopez").wasAbleTo(VerificarCuenta.verifyAccount());
		theActorInTheSpotlight().should(seeThat(Result.in(ListAcounts.NUM_CUENTA.of(RegistrarCuenta.getNumCuenta())),IsEqual.equalTo(RegistrarCuenta.getNumCuenta())));
		
	}

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
