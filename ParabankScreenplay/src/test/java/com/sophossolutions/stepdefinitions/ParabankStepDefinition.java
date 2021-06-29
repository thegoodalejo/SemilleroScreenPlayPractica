package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.LoginTask;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParabankStepDefinition
{
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String strUrl)
	{
		System.out.println("@GIVEN");
		OnStage.theActorCalled("Julian Rodriguez").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingrese con el usuario {string} y contrasena {string}")
	public void ingreseConElUsuarioYContrasena(String strUser, String strPassword)
	{
		System.out.println("@WHEN");
		OnStage.theActorCalled("Julian. Rodriguez").wasAbleTo(LoginTask.withCredential(strUser, strPassword));
	}

	@Then("Registre la nueva cuenta {string}")
	public void registreLaNuevaCuenta(String strAcount)
	{
		System.out.println("@THEN");
		
	}
	
	@Before
	public void setTheStage()
	{
		OnStage.setTheStage(new OnlineCast());
	}
}