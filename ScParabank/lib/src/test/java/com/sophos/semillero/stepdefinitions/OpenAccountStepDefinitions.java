package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.Result;
import com.sophos.semillero.tasks.GoToHomePage;
import com.sophos.semillero.tasks.GoToOpenAccountPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.OpenAccount;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.OpenAccountPage;

public class OpenAccountStepDefinitions {

	@Given("Voy a la pagina de creacion de cuentas")
	public void voyALaPaginaDeCreacionDeCuentas() {
		theActorInTheSpotlight().wasAbleTo(GoToOpenAccountPage.usingButtonOnTheLeftPanel());
	}

	@When("Abro una cuenta {string} con un saldo inicial de {int}")
	public void abroUnaCuentaConUnSaldoInicialDe(String strAccountType, int numStartingBalance) {
		theActorInTheSpotlight().wasAbleTo(OpenAccount.choosingTheProperOptions(strAccountType, numStartingBalance));

		String strNewAccountNumber = OpenAccountPage.TXT_NEWACCOUNTNUMBER.resolveFor(theActorInTheSpotlight())
				.getText();
		System.out.println("Cuenta " + strAccountType + " nueva #" + strNewAccountNumber);
	}

	@When("Valido que la apertura haya sido confirmada")
	public void validoQueLaAperturaHayaSidoConfirmada() {
		String strMessage = "Account Opened!";
		theActorInTheSpotlight().should(seeThat(Result.in(OpenAccountPage.TXT_SUCCESS), IsEqual.equalTo(strMessage)));
	}

	@Then("Vuelvo al menu principal")
	public void vuelvoAlMenuPrincipal() {
		theActorInTheSpotlight().wasAbleTo(GoToHomePage.usingButtonOnTheLeftPanel());
	}

	@Then("Valido que la cuenta haya sido abierta exitosamente")
	public void validoQueLaCuentaHayaSidoAbiertaExitosamente() {
		String numCuenta = theActorInTheSpotlight().recall("NUM_NUEVACUENTA");

		theActorInTheSpotlight().should(
				seeThat(Result.in(HomePage.TXT_NEWACCOUNTNUMBERINLIST.of(numCuenta)), IsEqual.equalTo(numCuenta)));
	}

	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
