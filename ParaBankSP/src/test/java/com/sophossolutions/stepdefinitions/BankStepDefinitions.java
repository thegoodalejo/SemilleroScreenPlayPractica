package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.questions.Validate;
import com.sophossolutions.tasks.Login;
import com.sophossolutions.tasks.OpenNew;
import com.sophossolutions.tasks.See;
import com.sophossolutions.ui.OpenAccountPage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class BankStepDefinitions {

	@Given("La pagina web del banco {string}")
	public void laPaginaWebDelBanco(String strUrl) {
		theActorCalled("Andres Guarnizo").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso usuario {string} y password {string}")
	public void ingresoUsuarioYPassword(String strUser, String strPass) {
		theActorCalled("Andres Guarnizo").wasAbleTo(Login.withCredentials(strUser, strPass));
	}

	@Then("Creo cuenta de ahorros nueva")
	public void creoCuentaDeAhorrosNueva() {
		theActorCalled("Andres Guarnizo").wasAbleTo(OpenNew.account());
	}

	@Then("Valido que este abierta")
	public void validoQueEsteAbierta() {
		theActorInTheSpotlight().should(seeThat(Validate.account(OpenAccountPage.NUMERO_CUENTA)));
		theActorCalled("Andres Guarnizo").wasAbleTo(See.account());
	}

	@Then("Imprimo el saldo disponible")
	public void imprimoElSaldoDisponible() {

	}

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
