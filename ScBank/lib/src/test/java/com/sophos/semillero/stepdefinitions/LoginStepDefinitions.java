package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.questions.AccountResult;
import com.sophos.semillero.questions.AccountVerification;
import com.sophos.semillero.tasks.ConsultAccount;
import com.sophos.semillero.tasks.CreateAccount;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.OpenaccountPage;
import com.sophos.semillero.ui.OverviewPage;

public class LoginStepDefinitions {
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Angel Vivas").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredentials(strName, strPassword));
		theActorInTheSpotlight().wasAbleTo(CreateAccount.go());	
	}

	@Then("Valido la cuenta creada")
	public void validoLaCuentaCreada() {
		String newNumberAccount = AccountResult.in(OpenaccountPage.TXT_NUMBER_NEW_ACCOUNT).answeredBy(theActorInTheSpotlight());
		
		theActorInTheSpotlight().wasAbleTo(ConsultAccount.go());
		
		theActorInTheSpotlight()
			.should(seeThat(AccountVerification.in(OverviewPage.TABLE_ACCOUNTS, newNumberAccount), IsEqual.equalTo(true)));
		
	}
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
