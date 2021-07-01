package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.questions.NumberAcount;
import com.sophossolutions.tasks.RegisterAcountTask;
import com.sophossolutions.ui.ParabankLogin;
import com.sophossolutions.ui.RegisterAcount;
import com.sophossolutions.util.Constants;

import org.hamcrest.core.IsEqual;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterAcountStepDefinition
{
	@Given("Quiero estar en la pagina que muestra las cuentas")
	public void quieroEstarEnLaPaginaQueMuestraLasCuentas()
	{
		theActorCalled(Constants.actor).should(seeThat(the(ParabankLogin.VISIBLE_TABLE), isVisible()));
	}

	@When("Registrar nueva cuenta de tipo {string}")
	public void registrarNuevaCuentaDeTipo(String strTypeAcount)
	{
	    theActorCalled(Constants.actor).wasAbleTo(RegisterAcountTask.withType(strTypeAcount));
	}

	@Then("Deberia encontrar la cuenta nueva")
	public void deberiaEncontrarLaCuentaNueva()
	{	String numberAcount = theActorInTheSpotlight().recall(Constants.remember);
		theActorInTheSpotlight().should(seeThat(NumberAcount.withNumber(RegisterAcount.NEW_NUMBER_ACOUNT.of(numberAcount)),IsEqual.equalTo(numberAcount)));
	}

	@Before()
	public void setup()
	{	
		setTheStage(new OnlineCast());
	}
}