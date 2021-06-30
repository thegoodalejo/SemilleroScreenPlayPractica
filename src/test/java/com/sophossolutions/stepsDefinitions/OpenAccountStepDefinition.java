package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.tasks.OpenAccount;
import com.sophossolutions.ui.AccountPage;
import com.sophossolutions.ui.ListAccountPage;
import com.sophossolutions.questions.Result;
import com.sophossolutions.tasks.Account;
import com.sophossolutions.tasks.Login;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenAccountStepDefinition {

	@Given("Que me logueo con el {string} y el {string} en la pagina {string}")
	public void queMeLogueoConElYElEnLaPagina(String strUser, String strPassword, String strUrl) {
		theActorCalled("Valentina Correa").wasAbleTo(Open.url(strUrl), Login.with(strUser, strPassword));
	}

	@When("Abro una cuenta con el {string} y una {string}")
	public void abroUnaCuentaConElYUna(String strTypeAcount, String strExistingAcount) {
		theActorCalled("Valentina Correa").wasAbleTo(OpenAccount.with(strTypeAcount, strExistingAcount));
	}

	@Then("Valido que la cuenta este abierta")
	public void validoQueLaCuentaEsteAbierta() {

		String numCuenta = AccountPage.LINK_ACCOUNT_DETAILS.resolveFor(theActorInTheSpotlight()).getText();
		String xpath1="//tr[@ng-repeat='account in accounts'][";
		String xpath2="]//td[1]//a";
		String xpath3="]//td[3]";
		
		theActorCalled("Valentina Correa").wasAbleTo(Account.list());
		theActorInTheSpotlight().should(seeThat(Result.in(xpath1,xpath2,xpath3,numCuenta ),IsEqual.equalTo(numCuenta)));
		
	}

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
