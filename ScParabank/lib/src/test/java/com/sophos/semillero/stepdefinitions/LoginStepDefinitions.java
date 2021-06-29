package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.OpenAccount;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.OpenAccountPage;

public class LoginStepDefinitions {
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
	    theActorCalled("Juan Carlos").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("Juan Carlos").wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	/*
	@When("Valido que el titulo sea {string}")
	public void validoQueElTituloSea(String strTitle) {
	    theActorInTheSpotlight().should(seeThat(Result.in(HomePage.TXT_WELCOME_MSG), IsEqual.equalTo(strTitle)));
	}
	*/
	
	@When("Abro una cuenta {string} con un saldo inicial de {int}")
	public void abroUnaCuentaConUnSaldoInicialDe(String strAccountType, int numStartingBalance) {
	    theActorInTheSpotlight().wasAbleTo(OpenAccount.clickingOnOpenAccount(strAccountType, numStartingBalance));
	}
	
	/*
	@When("Valido que el mensaje de apertura sea {string}")
	public void validoQueElMensajeDeAperturaSea(String strMessage) {
	    theActorInTheSpotlight().should(seeThat(Result.in(OpenAccountPage.TXT_SUCCESS), IsEqual.equalTo(strMessage)));
	}
	*/
	
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
}
