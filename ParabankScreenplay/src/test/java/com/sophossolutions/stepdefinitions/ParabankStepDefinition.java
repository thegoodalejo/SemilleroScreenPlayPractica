package com.sophossolutions.stepdefinitions;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.NumberAcount;
import com.sophossolutions.tasks.LoginTask;
import com.sophossolutions.tasks.NewAcountNuberTask;
import com.sophossolutions.tasks.RegistroCuentaTask;
import com.sophossolutions.ui.RegisterAcount;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
		espera(6);
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
		OnStage.theActorCalled("Julian. Rodriguez").wasAbleTo(RegistroCuentaTask.in(strAcount));
		OnStage.theActorCalled("Julian. Rodriguez").wasAbleTo(NewAcountNuberTask.in(RegisterAcount.TXT_NEW_ACOUNT));
		
		OnStage.theActorInTheSpotlight().should(seeThat(NumberAcount.in(RegisterAcount.TXT_ACOUNT_NUMBER.of(NumberAcount.acountNumber), RegisterAcount.TXT_ACOUNT_NUMBER), IsEqual.equalTo(NumberAcount.acountNumber)));
	}
	
	@Before
	public void settup()
	{
		OnStage.setTheStage(new OnlineCast());
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