package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.questions.Validate;
import com.sophossolutions.tasks.SelectOption;
import com.sophossolutions.tasks.OpenNew;
import com.sophossolutions.ui.OpenAccountPage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class NewUserStepDefinitions {

	@Given("Estando en Home ingreso a crear una nueva cuenta")
	public void estandoEnHomeIngresoACrearUnaNuevaCuenta() {
		theActorCalled("Andres Guarnizo").wasAbleTo(SelectOption.link("Open New Account"));
	}

	@When("creo la cuenta Seleccionando tipo de cuenta y una cuenta previa")
	public void creoLaCuentaSeleccionandoTipoDeCuentaYUnaCuentaPrevia() {
		theActorCalled("Andres Guarnizo").wasAbleTo(OpenNew.account());
	}
	
	@Then("Valido que la cuenta se haya creado con el saldo")
	public void validoQueLaCuentaSeHayaCreadoConElSaldo() {
		String strNumCuenta = OpenAccountPage.NUMERO_CUENTA.resolveFor(theActorInTheSpotlight()).getTextValue();
		theActorCalled("Andres Guarnizo").wasAbleTo(SelectOption.link("Accounts Overview"));
		theActorInTheSpotlight().should(seeThat(Validate.account(strNumCuenta)));
	}

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
