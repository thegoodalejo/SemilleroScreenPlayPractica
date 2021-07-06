package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.LoginTask;
import com.sophossolutions.ui.ParabankLogin;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ParabankStepDefinition
{	
	private String actor= "Julian Rodriguez";
	
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String strUrl)
	{
		System.out.println("@GIVEN");
		theActorCalled(actor).wasAbleTo(Open.url(strUrl));
	}

	@When("Ingrese con el usuario {string} y contrasena {string}")
	public void ingreseConElUsuarioYContrasena(String strUser, String strPassword)
	{
		System.out.println("@WHEN");
		theActorCalled(actor).wasAbleTo(LoginTask.withCredential(strUser, strPassword));
	}

	@Then("Ir a la pagina de inicio")
	public void irALaPaginaDeInicio()
	{
		System.out.println("@THEN");
		theActorCalled(actor).should(seeThat(the(ParabankLogin.VISIBLE_TABLE), isVisible()));
	}
	
	@Before
	public void settup()
	{
		setTheStage(new OnlineCast());
	}
	
	private void espera(int s)
	{
		try
		{
			Thread.sleep(s * 1000);
		}
		catch (Exception e)
		{}
	}
}