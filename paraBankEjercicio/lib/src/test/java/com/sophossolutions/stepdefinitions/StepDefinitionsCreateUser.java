package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.semillero.tasks.CreateUser;
import com.sophossolutions.ui.HomePage;

public class StepDefinitionsCreateUser {
	
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Verificar que el estamos en en el Home {string}")
	public void verificarQueElEstamosEnEnElHome(String txtMssg) {
		theActorCalled("Juan Miguel").should(seeThat(TextObtained.inTitlePage(HomePage.TXT_TITLE_PAGE), IsEqual.equalTo(txtMssg)));
	}

	@When("Realizar la creacion del nuevo usuario tipo {string} y opcion {string}")
	public void realizarLaCreacionDelNuevoUsuarioTipoYOpcion(String typeAccount, String numbAccount) {
		theActorInTheSpotlight().wasAbleTo(CreateUser.whitData(typeAccount, numbAccount));
	}

	@Then("Validar que exista la opcion en las cuentas creadas")
	public void validarQueExistaLaOpcionEnLasCuentasCreadas() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	/*
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Ingresar a (.+) y hacer login con (.+) (.+)$")
	public void ingresarAYHacerLoginConJohnDemo(String url, String user, String password) {
		
		theActorCalled("Juan Miguel").wasAbleTo(Open.url(url));
		theActorCalled("Juan Miguel").wasAbleTo(Login.whitCredentials(user, password));
	}
	
	@When("Hacer el proceso de creacion para la opcion (.+) (.+)$")
	public void hacerElProcesoDeCreacionParaLaOpcion(String strType, Integer txtNumber) {
		theActorInTheSpotlight().wasAbleTo(ParaBankHome.createUser(strType, txtNumber.toString()));
		
	}
	
	@Then("Validar que exista el dato")
	public void validarQueExistaElDato() {
		theActorInTheSpotlight().wasAbleTo(ParaBankAccounts.seeList());
	}
	*/
}
