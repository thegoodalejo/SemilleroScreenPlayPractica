package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import com.sophossolutions.questions.AccountCreated;
import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.semillero.tasks.BankAccounts;
import com.sophossolutions.semillero.tasks.CreateUser;
import com.sophossolutions.ui.AccountListPage;
import com.sophossolutions.ui.HomePage;

public class StepDefinitionsCreateUser {
	
	private String id = "";
	int timeWait = 5;
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Verificar que el estamos en en el Home {string}")
	public void verificarQueElEstamosEnEnElHome(String txtMssg) {
		theActorCalled("Juan Miguel").should(seeThat(TextObtained.inTitlePage(HomePage.TXT_TITLE_PAGE), IsEqual.equalTo(txtMssg)));
	}

	@When("Realizar la creacion del nuevo usuario tipo {string} y opcion {int}")
	public void realizarLaCreacionDelNuevoUsuarioTipoYOpcion(String typeAccount, Integer numbAccount) {
		theActorInTheSpotlight().wasAbleTo(CreateUser.whitData(typeAccount, numbAccount.toString()));
		id = theActorInTheSpotlight().recall("ID_ACCOUNT");
		theActorInTheSpotlight().wasAbleTo(BankAccounts.seeList());
	}

	@Then("Validar que exista la opcion en las cuentas creadas")
	public void validarQueExistaLaOpcionEnLasCuentasCreadas() {
	    WaitUntil.the(AccountListPage.TXT_ACCOUNT_IN_LIST.of(id), isVisible()).forNoMoreThan(timeWait).seconds();
	    theActorInTheSpotlight().should(seeThat(AccountCreated.exist(AccountListPage.TXT_ACCOUNT_IN_LIST.of(id)), IsEqual.equalTo(id)));
	}
	
}
