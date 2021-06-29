package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophos.semillero.tasks.LoginBanco;
import com.sophos.semillero.tasks.RegistrarCuenta;
import com.sophos.semillero.tasks.VerificarCuenta;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroBancoStepDefinitions {
	
	
	@Given("Deseo ir a la pagina de {string}")
	public void deseoIrALaPaginaDe(String strUrl) {
		theActorCalled("Andres Lopez").wasAbleTo(Open.url(strUrl));
	   
	}

	@When("Ingreso nombre de usuario {string} y password {string}")
	public void ingresoNombreDeUsuarioYPassword(String strUser, String strPassword) {
		theActorCalled("Andres Lopez").wasAbleTo(LoginBanco.withCredential(strUser, strPassword));
	    
	}
	@When("Registrar una nueva cuenta {string}")
	public void registrarUnaNuevaCuenta(String strValue) {
		theActorCalled("Andres Lopez").wasAbleTo(RegistrarCuenta.withValue(strValue));
	   
	}

	@Then("Valido que la cuenta fue creada")
	public void validoQueLaCuentaFueCreada() {
		theActorCalled("Andres Lopez").wasAbleTo(VerificarCuenta.verifyAccount());
	   
	}
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
