package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.questions.AccountVerification;
import com.sophos.semillero.tasks.CreateAccount;
import com.sophos.semillero.ui.OverviewPage;


public class AccountCreateStepDefinitions {
	
	@Given("Deseo ir a la pagina de registro de cuentas {string}")
	public void deseoIrALaPaginaDeRegistroDeCuentas(String url) {
		theActorInTheSpotlight().wasAbleTo(Open.url(url));
	}

	@When("Registro una cuenta de ahorro")
	public void registroUnaCuentaDeAhorro() {
		theActorInTheSpotlight().wasAbleTo(CreateAccount.go());
	}

	@Then("Valido la nueva cuenta")
	public void validoLaNuevaCuenta() {
		theActorInTheSpotlight().should(seeThat(AccountVerification.in(OverviewPage.TXT_ACCOUNT), IsEqual.equalTo(true)));
	}
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
